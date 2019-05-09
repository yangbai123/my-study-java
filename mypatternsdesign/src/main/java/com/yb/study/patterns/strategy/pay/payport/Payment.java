package com.yb.study.patterns.strategy.pay.payport;


import com.yb.study.patterns.strategy.pay.PayState;

/**
 * 支付渠道(相当于支付策略)
 * Created by YB
 */
public interface Payment {

    PayState pay(String uid, double amount);

}
