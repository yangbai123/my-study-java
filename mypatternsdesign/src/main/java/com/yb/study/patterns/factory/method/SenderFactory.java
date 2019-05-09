package com.yb.study.patterns.factory.method;


import com.yb.study.patterns.factory.Sender;

/**
 * 在简单工厂模式的基础上，让我们对工厂类也升级一下，首先定义一个工厂类接口：
 * @author YB
 */
public interface SenderFactory {

    Sender createSender();

}
