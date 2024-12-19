package com.fancy.experiment4;

public class DataCourseFactory implements CourseFactory{

    @Override
    public OnlineCourse produceOnlineCourse() {
        return new DataOnlineCourse() ;
    }

    @Override
    public OfflineCourse produceOfflineCourse() {
        return new DataOfflineCourse();
    }
}
