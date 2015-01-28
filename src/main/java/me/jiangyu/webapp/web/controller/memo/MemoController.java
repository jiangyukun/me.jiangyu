package me.jiangyu.webapp.web.controller.memo;

import me.jiangyu.webapp.domain.Memo;
import me.jiangyu.webapp.domain.User;
import me.jiangyu.webapp.dto.MemoDto;
import me.jiangyu.webapp.service.MemoService;
import me.jiangyu.webapp.service.UserService;
import me.jiangyu.webapp.web.controller.account.AccountUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by jiangyukun on 2014/12/1.
 */
@Controller
@RequestMapping("/memo")
@SessionAttributes(AccountUtils.ID_STRING)
public class MemoController {
    @Resource
    private UserService userService;
    @Resource
    private MemoService memoService;

    @RequestMapping(value = "/addMemo", method = RequestMethod.POST)
    public String addMemoResult(Memo memo, @ModelAttribute(AccountUtils.ID_STRING) String mobile) {
        User user = userService.findUserByMobile(mobile);
        memo.setUser(user);
        memoService.saveMemo(memo);
        return "redirect:/memo/addMemoResult";
    }

    @RequestMapping(value = "/addMemo", method = RequestMethod.GET)
    public String addMemo(String a) {
        return "/memo/addMemo";
    }

    @RequestMapping(value = "/addMemoResult", method = RequestMethod.GET)
    public String addMemoResult() {
        return "/memo/addMemoResult";
    }

    @RequestMapping(value = "/allMemo", method = RequestMethod.GET)
    public String addMemo(@ModelAttribute(AccountUtils.ID_STRING) String mobile, Model model) {
        User user = userService.findUserByMobile(mobile);
        model.addAttribute("memos", user.getMemos());
        return "/memo/allMemo";
    }

    @RequestMapping("/memoDetail")
    public String memoDetail(String memoId, Model model) {
        model.addAttribute("memoId", memoId);
        return "/memo/memoDetail";
    }

    @RequestMapping("/getMemoContent")
    @ResponseBody
    public MemoDto getMemoContent(String memoId) {
        Memo memo = memoService.findMemoById(memoId);
        MemoDto memoDto = new MemoDto(memo.getUuid(), memo.getTitle(), memo.getContent(), memo.getPostData().toString());
        return memoDto;
    }
}
