package com.fancy.experiment6;

public class EduExperience {
    private String school; //学校
    private String eduTime; //学习时间段

    public EduExperience(String school, String eduTime) {
        this.school = school;
        this.eduTime = eduTime;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getEduTime() {
        return eduTime;
    }

    public void setEduTime(String eduTime) {
        this.eduTime = eduTime;
    }

    @Override
    public String toString() {
        return "EduExperience{" +
                "school='" + school + '\'' +
                ", eduTime='" + eduTime + '\'' +
                '}';
    }
}
