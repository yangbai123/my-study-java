package com.yb.study.patterns.strategy.pay.payport;


import com.yb.study.patterns.strategy.pay.PayState;

/**
 * 具体支付策略
 * Created by YB
 */
public class AliPay implements Payment {

    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用支付宝");
        System.out.println("查询账户余额，开始扣款");
        return new PayState(200,"支付成功",amount);
    }
}
