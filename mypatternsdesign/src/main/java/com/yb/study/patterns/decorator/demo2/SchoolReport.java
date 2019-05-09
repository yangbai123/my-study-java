package com.yb.study.patterns.decorator.demo2;

/**
 * 抽象成绩单
 * @author YBl
 */
public interface SchoolReport {
    /**
     * 报告成绩
     */
    void report();

    /**
     * 签名
     * @param name
     */
    void sign(String name);

}
