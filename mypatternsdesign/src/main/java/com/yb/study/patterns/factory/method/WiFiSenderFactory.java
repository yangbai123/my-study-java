package com.yb.study.patterns.factory.method;

import com.yb.study.patterns.factory.Sender;
import com.yb.study.patterns.factory.WiFiSender;

/**
 * 为每一个发送器的实现类各创建一个具体的工厂方法去实现这个接口
 */
public class WiFiSenderFactory implements SenderFactory {
    @Override
    public Sender createSender() {
        return new WiFiSender();
    }
}
