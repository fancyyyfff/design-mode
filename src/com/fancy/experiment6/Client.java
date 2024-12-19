package com.fancy.experiment6;

public class Client {
    public static void main(String[] args) {
        Resume oldResume,newResume1,newResume2;

        EduExperience litleEduExperience = new EduExperience("希望小学","2010-2016");
        EduExperience middleEduExperience = new EduExperience("阳光中学","2016-2019");
        EduExperience bigEduExperience = new EduExperience("草莓大学","2019-2023");

        oldResume = new Resume("fancy","女",litleEduExperience);
        newResume1=oldResume.clone();
        newResume1.setEduExp(middleEduExperience);

        newResume2=newResume1.clone();
        newResume2.setEduExp(bigEduExperience);

        System.out.println("简历1"+oldResume.toString());
        System.out.println("简历2"+newResume1.toString());
        System.out.println("简历3"+newResume2.toString());

        System.out.println("简历地址是否相同"+(oldResume==newResume1));  //false
        System.out.println("小学学历地址是否相同"+(oldResume.getEduExp()==litleEduExperience)); //true

    }
}
