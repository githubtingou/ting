package com.java.ting.config;

import com.java.ting.common.ResponseCode;
import com.java.ting.common.ResponseVo;
import com.java.ting.common.utils.ResponseUtils;
import com.java.ting.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * login
 *
 * @author tingOu
 */
@Controller
public class LoginConfig {
    ResponseUtils responseUtils = new ResponseUtils();


    @RequestMapping(value = "/notLogin")
    @ResponseBody
    public  ResponseVo notLogin(){
        return responseUtils.buildResponseCode(ResponseCode.SUCCESS_CODE);
    }

    /**
     * 登录
     * @param user
     * @return
     */
    @RequestMapping(value = "/login")
    public ResponseVo loginPage(@RequestBody User user) {
        // 从SecurityUtils里边创建一个 subject
        Subject subject = SecurityUtils.getSubject();
        // 在认证提交前准备 token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(),user.getPassword());
        // 执行认证登陆
        subject.login(token);
        //根据权限，指定返回数据
        String role = "user";
        if ("user".equals(role)) {
            return responseUtils.buildResponseCode(ResponseCode.SUCCESS_CODE);
        }
        if ("admin".equals(role)) {
            return responseUtils.buildResponseCodeData(ResponseCode.SUCCESS_CODE,"管理");
        }
        return responseUtils.buildResponseCode(ResponseCode.SHIRO_ERROR_CODE);

    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        //注销
        subject.logout();
        return "成功注销";
    }

}
