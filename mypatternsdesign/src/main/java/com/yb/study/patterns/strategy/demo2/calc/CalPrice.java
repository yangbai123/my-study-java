package com.yb.study.patterns.strategy.demo2.calc;

/**
 * @author YBl
 */
public interface CalPrice {

    //根据原价返回一个最终的价格
    Double calPrice(Double originPrice);

}
