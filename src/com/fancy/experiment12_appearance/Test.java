package com.fancy.experiment12_appearance;

public class Test {
    public static void main(String[] args) {
        // 通过 XMLUtil 获取 GraduationService 的实例
        GraduationService graduation = (GraduationService) XMLUtil.getBean();

        if (graduation != null) {
            // 调用 leaving 方法办理离校手续
            graduation.leaving();
        } else {
            System.out.println("未能加载 GraduationService 类");
        }
    }
}
