package com.fancy.experiment4;

public class JavaCourseFactory implements CourseFactory{
    @Override
    public OnlineCourse produceOnlineCourse() {
        return new JavaOnlineCourse();
    }

    @Override
    public OfflineCourse produceOfflineCourse() {
        return new JavaOfflineCourse();
    }
}
