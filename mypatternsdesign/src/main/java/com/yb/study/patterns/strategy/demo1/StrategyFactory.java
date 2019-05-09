package com.yb.study.patterns.strategy.demo1;

/**
 * @author YBl
 */
public class StrategyFactory {

    public static void strategyMethod(String type) {
        Strategy strategy;

        if("a".equals(type)) {
            strategy = new ConcreteStrategyA();
        } else {
            strategy = new ConcreteStrategyB();
        }

        Context context = new Context(strategy);

        context.contextMethod();
    }

}
