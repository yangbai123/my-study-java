package com.yb.study.patterns.factory.abstractfactory;

/**
 * Created by YB.
 */
public class JavaCourseFactory implements CourseFactory {

    public INote createNote() {
        return new JavaNote();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }
}
