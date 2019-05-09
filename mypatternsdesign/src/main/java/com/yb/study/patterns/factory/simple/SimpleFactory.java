package com.yb.study.patterns.factory.simple;

import com.yb.study.patterns.factory.BluetoothSender;
import com.yb.study.patterns.factory.Sender;
import com.yb.study.patterns.factory.WiFiSender;

/**
 * @author YB
 */
public class SimpleFactory {

    public static Sender createSender(String mode) {
        switch (mode) {
            case "Wi-Fi":
                return new WiFiSender();
            case "Bluetooth":
                return new BluetoothSender();
            default:
                throw new IllegalArgumentException("illegal type: " + mode);
        }
    }

}
