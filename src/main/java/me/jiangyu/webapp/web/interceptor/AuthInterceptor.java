package me.jiangyu.webapp.web.interceptor;

import me.jiangyu.webapp.web.controller.account.AccountUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by jiangyukun on 2014/12/1.
 */
@Component
public class AuthInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getServletPath().equals(AccountUtils.REDIRECT_PATH) || request.getServletPath().indexOf('.') != -1) {
            return true;
        }
        if (StringUtils.isEmpty(request.getSession().getAttribute(AccountUtils.ID_STRING))) {
            response.sendRedirect(request.getContextPath() + AccountUtils.REDIRECT_PATH);
            return false;
        }
        return true;
    }
}
