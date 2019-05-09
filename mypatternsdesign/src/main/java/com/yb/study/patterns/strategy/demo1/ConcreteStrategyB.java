package com.yb.study.patterns.strategy.demo1;

/**
 * 策略实现B
 * @author YBl
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("strategyMethod B....");
    }
}
