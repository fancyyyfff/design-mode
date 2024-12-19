package com.fancy.experiment10_component;

public class Test {
    public static void main(String[] args) {
        Institution gduf;//学校
        Institution gzCampus,zqCampus,qyCampus;//校区
        //各部门
        Institution gzTeachinService,gzStuAffDepart,gzLogistics;
        Institution zqTeachinService,zqStuAffDepart,zqLogistics;
        Institution qyTeachinService,qyStuAffDepart,qyLogistics;
        gduf = new Campus("广东金融学院");

        gzCampus = new Campus("本部");
        zqCampus = new Campus("肇庆校区");
        qyCampus = new Campus("清远校区");

        gzTeachinService = new TeachingServiceDepartment("教务处（部）");
        gzStuAffDepart = new StudentAffairsDepartment("学生（处）部");
        gzLogistics = new LogisticsDepartment("后勤处（部）");

        zqTeachinService = new TeachingServiceDepartment("教务处（部）");
        zqStuAffDepart = new StudentAffairsDepartment("学生（处）部");
        zqLogistics = new LogisticsDepartment("后勤处（部）");

        qyTeachinService = new TeachingServiceDepartment("教务处（部）");
        qyStuAffDepart = new StudentAffairsDepartment("学生（处）部");
        qyLogistics = new LogisticsDepartment("后勤处（部）");

        //对象之间建立关联

        gzCampus.add(gzTeachinService);
        gzCampus.add(gzStuAffDepart);
        gzCampus.add(gzLogistics);

        zqCampus.add(zqTeachinService);
        zqCampus.add(zqStuAffDepart);
        zqCampus.add(zqLogistics);

        qyCampus.add(qyTeachinService);
        qyCampus.add(qyStuAffDepart);
        qyCampus.add(qyLogistics);

        gduf.add(gzCampus);
        gduf.add(zqCampus);
        gduf.add(qyCampus);

        gduf.action();
    }
}
