package com.yb.study.patterns.decorator.demo1;

/**
 * 一般是一个抽象类,实现接口或者抽象方法
 * @author YBl
 */
public abstract class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void method() {
        //委托给构件
        this.component.method();
    }

}
