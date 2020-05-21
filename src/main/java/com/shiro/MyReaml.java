package com.shiro;

import jdk.nashorn.internal.parser.Token;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 23:17 2020/5/20
 *//*
*自定义的安全框架类
create by caocong on  2020/5/20
*/
public class MyReaml extends AuthorizingRealm {

    //授权：确认用户权限
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //1.根据principalCollection(用户名)去数据库查询该用户有用权限和角色

        //得到用户名
        String username = principalCollection.toString();

        //获取角色
        Set<String> roles = getRoles(username);
        //获取权限
        Set<String> permissions = getPermissions(username);

        //2.将角色和权限封装到Authrizationinfo交给shiro
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();

        authorizationInfo.setRoles(roles);//角色信息赋给shiro
        authorizationInfo.setStringPermissions(permissions);//权限信息赋给shiro

        return authorizationInfo;
    }

    //认证 确认用户身份
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //token就是收集到的用户信息
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;

        //1.根据用户提交的用户名，查看用户名是否存在
        String username = authenticationToken.getPrincipal().toString();
        System.out.println("用户名是:" + username);
        String password = checkUserName(username);
        //2.查询数据库，确认用户名是否存在:
        if (password == null) {
            throw new UnknownAccountException("用户名不存在");
        } else {
            //3.如果用户名存在获取用户正确密码
            //4.有对应用户名密码则交给shiro，我们提供正确用户名和密码

            SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(username, password, this.getName());
            return authenticationInfo;
        }
        //认证用户是否正确的工作还是要提交给shiro，我们提供正确的用户名和密码
    }


    //根据用户名查询密码，存在就返回密码，否则返回null
    public String checkUserName(String username) {
        //调用dao层方法进行判断
        return "123";
    }


    //数据库查询用户角色集合
    public Set<String> getRoles(String username) {

        //set无序不允许重复
        Set<String> sets = new HashSet<>();
        if (username.equals("zhangsan")) {
            sets.add("boss");
        } else {
            sets.add("manager");
        }
        return sets;
    }


    //数据库查询用户权限信息
    public Set<String> getPermissions(String username) {
        Set<String> sets = new HashSet<>();
        if (username.equals("zhangsan")) {
            sets.add("worker:add");
        } else {
            sets.add("worker:delete");
        }
        return sets;
    }

}
