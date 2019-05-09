package com.yb.study.patterns.factory;


/**
 * Created by YB.
 */
public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制Java课程");
    }
}
