package com.yb.study.patterns.factory;

/**
 * @author YB
 */
public class BluetoothSender implements Sender {
    @Override
    public void sendData(byte[] data) {
        System.out.println("Send data by Bluetooth");
    }
}
