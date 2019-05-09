package com.yb.study.patterns.factory.factorymethod;

import com.yb.study.patterns.factory.ICourse;
import com.yb.study.patterns.factory.JavaCourse;

/**
 * Created by YB.
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
