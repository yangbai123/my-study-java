package com.yb.study.patterns.prototype.simple;

/**
 * 浅拷贝
 * Created by YB .
 */
public class CloneTarget extends Prototype {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
