package com.yb.study.patterns.factory.method;

import com.yb.study.patterns.factory.BluetoothSender;
import com.yb.study.patterns.factory.Sender;

/**
 * @author YB
 */
public class BluetoothSenderFactory implements SenderFactory {
    @Override
    public Sender createSender() {
        return new BluetoothSender();
    }
}
