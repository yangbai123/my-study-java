package com.yb.study.patterns.factory.factorymethod;


import com.yb.study.patterns.factory.ICourse;

/**
 * Created by YB.
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();

        factory = new JavaCourseFactory();
        course = factory.create();
        course.record();

    }

}
