package com.yb.study.patterns.decorator.demo1;

/**
 * @author YBl
 * @create 4:29 PM 07/16/2018
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        super.method();
        System.out.println("after decorator!");
    }
}
