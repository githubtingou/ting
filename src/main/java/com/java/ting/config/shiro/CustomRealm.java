package com.java.ting.config.shiro;

import com.java.ting.domain.AdminUser;
import com.java.ting.domain.SysRole;
import com.java.ting.mapper.AdminUserMapper;
import com.java.ting.mapper.SysRoleMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 自定义身份认证
 *
 * @author tingOu
 */
@Slf4j
public class CustomRealm extends AuthorizingRealm {

    @Autowired
    private AdminUserMapper userMapper;
    @Autowired
    private SysRoleMapper roleMapper;

    /**
     * 获取身份验证信息
     * Shiro中，最终是通过 Realm 来获取应用程序中的用户、角色及权限信息的。
     *
     * @param authenticationToken 用户身份信息 token
     * @return 返回封装了用户信息的 AuthenticationInfo 实例
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
            throws AuthenticationException {
        log.info("身份认证");
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String loginUserName = token.getUsername();
        String password = "";
        if (token.getPassword() != null) {
            password = new String(token.getPassword());
        }
        AdminUser user = new AdminUser();
        // 从数据库获取对应用户名密码的用户
        user.setLoginName(loginUserName);
        user.setPassword(password);
        user = userMapper.getOneByCondition(user);

        if (StringUtils.isEmpty(password)) {
            log.error("用户名不正确");
            throw new AccountException("用户名不正确");
        }
        return new SimpleAuthenticationInfo(user, password, getName());
    }

    /**
     * 获取授权信息
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        log.info("权限认证");
        String username = (String) SecurityUtils.getSubject().getPrincipal();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //获得该用户角色
        List<SysRole> role = roleMapper.getRoleByName(username);
        Set<String> set = new HashSet<>();
        //需要将 role 封装到 Set 作为 info.setRoles() 的参数
        for (SysRole role1 : role) {
            set.add(role1.getName());
        }
        set.add("admin");
        //设置该用户拥有的角色
        info.setRoles(set);
        return info;
    }

}
