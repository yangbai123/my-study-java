package com.yb.study.patterns.decorator.demo1;

/**
 * concreteComponent是最核心,最原始,最基本的接口或抽象类的实现,要装饰的就是它
 * @author YBl
 */
public class ConcreteComponent implements Component {
    @Override
    public void method() {
        System.out.println("被装饰类实现的方法");
    }
}
