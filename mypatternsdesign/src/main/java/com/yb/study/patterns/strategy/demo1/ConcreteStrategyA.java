package com.yb.study.patterns.strategy.demo1;

/**
 * 策略实现A
 * @author YBl
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("strategyMethod A....");
    }
}
