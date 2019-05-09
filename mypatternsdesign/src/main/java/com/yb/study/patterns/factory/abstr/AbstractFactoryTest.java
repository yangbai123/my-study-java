package com.yb.study.patterns.factory.abstr;

import com.yb.study.patterns.factory.Sender;

/**
 * 在实际应用中最为广泛
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        Sender sender = senderFactory.createBluetoothSender();
        byte[] bytes = new byte[3];
        sender.sendData(bytes);
    }

}
