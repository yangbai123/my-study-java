package com.yb.study.patterns.factory.abstr;

import com.yb.study.patterns.factory.BluetoothSender;
import com.yb.study.patterns.factory.Sender;
import com.yb.study.patterns.factory.WiFiSender;

/**
 * Created by YB .
 */
public class SenderFactory extends AbstractFactory {
    @Override
    public Sender createBluetoothSender() {
        return new BluetoothSender();
    }

    @Override
    public Sender createWifiSender() {
        return new WiFiSender();
    }
}
