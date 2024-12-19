package com.fancy.experiment12_appearance;

public class GraduationService extends AbstractGraduationService{

    private String name;
    private FinancialAffairs affairs;
    private LibraryManagement libraryManagement;
    private LogisticsCenter logisticsCenter;

    public GraduationService(String name) {
        this.name = name;
        affairs = new FinancialAffairs();
        libraryManagement = new LibraryManagement();
        logisticsCenter = new LogisticsCenter();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void leaving() {
        System.out.println("------------"+name+"同学正在办理离校手续----------");
        affairs.payup();
        libraryManagement.returning();
        logisticsCenter.fee();
    }


}
