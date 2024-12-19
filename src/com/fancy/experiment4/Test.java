package com.fancy.experiment4;

public class Test {
    public static void main(String[] args) {
        CourseFactory factory = (CourseFactory)XMLUtil.getBean();
        OnlineCourse online = factory.produceOnlineCourse();
        OfflineCourse offline = factory.produceOfflineCourse();
        online.teaching();
        offline.teaching();
    }

}
