package com.java.ting.config;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.java.ting.common.ResponseCode;
import com.java.ting.common.ResponseVo;
import com.java.ting.common.utils.ResponseUtils;
import com.java.ting.domain.AdminUser;
import com.java.ting.mapper.AdminUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;


/**
 * login
 *
 * @author tingOu
 */
@Slf4j
@Controller
public class LoginConfig {

    @Autowired
    private AdminUserMapper adminUserMapper;

    @RequestMapping(value = {"/login"})
    public String login() {
        log.info("跳转到登录页面");
        return "login";
    }

    /**
     * 跳转到登录页面
     *
     * @return
     */
    @RequestMapping(value = "/front")
    public String toLogin() {
        return "index";
    }

    /**
     * 登录
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/toLogin")
    public ModelAndView loginPage(AdminUser user) {
        log.info("用户登录;user:{}", JSON.toJSON(user));
        ModelAndView modelAndView = new ModelAndView();
        //   AdminUser loginUser = adminUserMapper.getOneByCondition(user);
//        if (StringUtils.isEmpty(user.getLoginName()) || StringUtils.isEmpty(user.getPassword())) {
//            log.info("用户名或密码不能为空");
//            modelAndView.addObject(ResponseUtils.buildResponseCode(ResponseCode.SHIRO_ERROR_CODE));
//            modelAndView.setViewName("/login");
//        }
//        if (loginUser == null) {
//            modelAndView.addObject(ResponseUtils.buildResponseCode(ResponseCode.SHIRO_ERROR_CODE));
//            modelAndView.setViewName("/login");
//        } else {
        // 从SecurityUtils里边创建一个 subject
        Subject subject = SecurityUtils.getSubject();
        // 在认证提交前准备 token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken(user.getLoginName(), user.getPassword());
        user = adminUserMapper.getOneByCondition(user);
        // 执行认证登陆
        subject.login(token);
        //根据权限，指定返回数据
        String role = "user";
        ResponseVo responseVo = ResponseUtils.buildResponseCode(ResponseCode.SUCCESS_CODE);
        modelAndView.addObject(responseVo);
        modelAndView.setViewName("admin/adminIndex");
//        }
        return modelAndView;

    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        //注销
        subject.logout();
        return "login";
    }

    @RequestMapping("/notRole")
    public String noRole() {
        return "notRole";
    }
}
