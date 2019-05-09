package com.yb.study.patterns.factory.simplefactory;

import com.yb.study.patterns.factory.ICourse;
import com.yb.study.patterns.factory.JavaCourse;

/**
 * 小作坊式的工厂模型
 * Created by YB.
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

//        ICourse course = new JavaCourse();
//        course.record();

//        ICourseFactory factory = new ICourseFactory();
//        ICourse course = factory.create("com.gupaoedu.vip.pattern.factory.JavaCourse");
//        course.record();

        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(JavaCourse.class);
        course.record();

    }
}
