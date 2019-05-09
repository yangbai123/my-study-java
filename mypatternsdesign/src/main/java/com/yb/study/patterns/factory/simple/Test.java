package com.yb.study.patterns.factory.simple;


import com.yb.study.patterns.factory.Sender;

/**
 * @author YB
 */
public class Test {

    private static String mode; //Wi-Fi|Bluetooth

    public static void onClick() {
        byte[] data = {0x00, 0x01};

        Sender sender = SimpleFactory.createSender(mode);
        sender.sendData(data);
    }

    public static void main(String[] args) {
        mode = "Wi-Fi";

        onClick();

    }

}
