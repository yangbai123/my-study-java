package com.yb.study.patterns.factory.abstr;


import com.yb.study.patterns.factory.Sender;

/**
 * 抽象工厂优势：
 * 1.易于管理
 * 2.易于扩展
 */
public abstract class AbstractFactory {

    public abstract Sender createBluetoothSender();

    public abstract Sender createWifiSender();

}
