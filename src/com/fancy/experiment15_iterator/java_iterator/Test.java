package com.fancy.experiment15_iterator.java_iterator;

import com.fancy.experiment15_iterator.Scene;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Iterator<Scene> iterator;
        // 创建校区聚合信息
        Scene campusScene1 = new Scene("龙洞校区", "广州");
        Scene campusScene2 = new Scene("肇庆校区", "肇庆");
        Scene campusScene3 = new Scene("清远校区", "清远");
        Scene[] campusScenesArray = {campusScene1, campusScene2, campusScene3};

        CampusScenes campusScenes = new CampusScenes(campusScenesArray);
        iterator = campusScenes.iterator();
        while (iterator.hasNext()) {
            Scene next = iterator.next();
            System.out.println(next.getName() + "," + next.getInfo());
        }
        System.out.println("-----------------------------------");
        // 创建旅游景点聚合信息
        List<Scene> spotScenesList = new ArrayList<>();
        Scene spotScene1 = new Scene("广州", "这是广州");
        Scene spotScene2 = new Scene("深圳", "这是深圳");
        Scene spotScene3 = new Scene("肇庆", "这是肇庆");
        spotScenesList.add(spotScene1);
        spotScenesList.add(spotScene2);
        spotScenesList.add(spotScene3);

        SpotScenes spotScenes = new SpotScenes(spotScenesList);

        // 遍历旅游景点信息
        iterator = spotScenes.iterator();
        while (iterator.hasNext()) {
            Scene next = iterator.next();
            System.out.println(next.getName() + "," + next.getInfo());
        }
    }
}
