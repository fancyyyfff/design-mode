package com.fancy.experiment10_component;

import java.util.ArrayList;
import java.util.List;

public class Campus extends Institution {
    private String name;
    private List<Institution> institutions = new ArrayList<Institution>();

    public Campus(String name) {
        this.name = name;
    }

    @Override
    public void add(Institution institution) {
        institutions.add(institution);
    }

    @Override
    public void delete(Institution institution) {
        institutions.remove(institution);

    }

    @Override
    public Institution get(int index) {
        return (Institution) institutions.get(index);
    }

    @Override
    public void action() {
        System.out.println("----------"+name+"------------");
        for (Institution institution : institutions) {
            // 只对 Campus 类型的对象进行 action 调用
            if (institution instanceof Campus) {
                ((Campus) institution).action();  // 这里是安全的强制转换
            } else {
                institution.action();  // 对叶子节点直接调用 action
            }
        }

    }
}

