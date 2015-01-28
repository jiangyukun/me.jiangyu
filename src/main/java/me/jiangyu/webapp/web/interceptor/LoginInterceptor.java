package me.jiangyu.webapp.web.interceptor;

import me.jiangyu.webapp.web.controller.account.AccountUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by jiangyukun on 2014/12/1.
 */
@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if (modelAndView != null) {
            Map<String, Object> model = modelAndView.getModel();
            String id = (String) model.get(AccountUtils.ID_STRING);
            if (!StringUtils.isEmpty(id)) {
                request.getSession().setAttribute(AccountUtils.ID_STRING, id);
                model.remove(AccountUtils.ID_STRING);
            }
        }
    }
}
