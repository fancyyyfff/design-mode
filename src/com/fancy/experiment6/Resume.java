package com.fancy.experiment6;

public class Resume implements Cloneable{
    private String name;
    private String sex;
    private EduExperience eduExp;

    public Resume(String name, String sex, EduExperience eduExp) {
        this.name = name;
        this.sex = sex;
        this.eduExp = eduExp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EduExperience getEduExp() {
        return eduExp;
    }

    public void setEduExp(EduExperience eduExp) {
        this.eduExp = eduExp;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public Resume clone() {
        try {
            Resume clone = (Resume) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "基本信息[姓名："+name+" 性别："+sex+"] "
                + "学历[学习时间："+eduExp.getEduTime()+" 学校："+eduExp.getSchool()+"]]";
    }

}
