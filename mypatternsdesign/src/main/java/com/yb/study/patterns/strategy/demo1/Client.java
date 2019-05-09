package com.yb.study.patterns.strategy.demo1;

/**
 * @author YBl
 */
public class Client {

    public static void main(String[] args) {
//        ConcreteStrategyA a = new ConcreteStrategyA();
//        ConcreteStrategyB b = new ConcreteStrategyB();
//
//        Context context = new Context(a);
//
//        context.contextMethod();

        //可使用工厂模式包装一下
        StrategyFactory.strategyMethod("a");

    }

}
