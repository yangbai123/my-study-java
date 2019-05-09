package com.yb.study.patterns.factory;

/**
 * 把一段数据用Wi-Fi或者蓝牙发送出去。
 * @author YB
 */
public interface Sender {

    void sendData(byte[] data);

}
