package com.yb.study.patterns.proxy.common;

/**
 * 接口实现目标对象
 * @author YBl
 * @create 9:39 AM 07/13/2018
 */
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("----已经保存数据!----");
    }
}
