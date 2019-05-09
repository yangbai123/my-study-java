package com.yb.study.patterns.decorator.demo1;

/**
 * @author YBl
\ */
public class Test {

    public static void main(String[] args) {
        ConcreteDecorator cd = new ConcreteDecorator(new ConcreteComponent());
        cd.method();
    }

}
