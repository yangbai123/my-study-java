package com.yb.study.patterns.factory.factorymethod;

import com.yb.study.patterns.factory.ICourse;
import com.yb.study.patterns.factory.PythonCourse;

/**
 * Created by YB.
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
