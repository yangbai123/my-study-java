package com.yb.study.patterns.decorator.demo1;

/**
 * 需要被装饰类的接口
 * component是一个接口或者是抽象类,就是定义我们最核心的对象,也就是最原始的对象
 * 在装饰模式中,必然有一个最基本,最核心,也就是最原始的对象
 * @author YBl
 */
public interface Component {

    void method();

}
