package com.yb.study.patterns.decorator.demo2;

/**
 * 排名情况修饰
 * @author YBl
 */
public class SortScoreDecorator extends Decorator {
    public SortScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    public void reportSort(){
        System.out.println("排名情况是：第二名");
    }

    @Override
    public void report(){
        this.reportSort();
        super.report();
    }
}
