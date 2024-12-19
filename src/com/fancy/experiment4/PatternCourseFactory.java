package com.fancy.experiment4;

public class PatternCourseFactory implements CourseFactory{
    @Override
    public OnlineCourse produceOnlineCourse() {
        return new PatternOnlineCourse();
    }

    @Override
    public OfflineCourse produceOfflineCourse() {
        return new PatternOfflineCourse();
    }
}
