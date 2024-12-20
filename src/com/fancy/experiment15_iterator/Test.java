package com.fancy.experiment15_iterator;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        SceneAggregate sceneAggregate;
        SceneIterator sceneIterator;

        //创建校区聚合信息
        Scene campusScene1 = new Scene("龙洞校区", "广州");
        Scene campusScene2 = new Scene("肇庆校区","肇庆");
        Scene campusScene3 = new Scene("清远校区","清远");
        Scene[] campusScenesArray = {campusScene1, campusScene2, campusScene3};

        sceneAggregate = new CampusScenes(campusScenesArray);

        //实例化校区迭代对象
        sceneIterator = sceneAggregate.iterator();

        //遍历校区信息
        while (sceneIterator.hasNext()) {
            Scene campusScene = sceneIterator.next();
            System.out.println(campusScene.getName()+","+campusScene.getInfo());
        }

        System.out.println("-----------------------------------");

        //创建旅游景点聚合信息
        List<Scene> spotScenesList = new ArrayList<>();
        Scene spotScene1 = new Scene("广州", "这是广州");
        Scene spotScene2 = new Scene("深圳", "这是深圳");
        Scene spotScene3 = new Scene("肇庆", "这是肇庆");
        spotScenesList.add(spotScene1);
        spotScenesList.add(spotScene2);
        spotScenesList.add(spotScene3);

        sceneAggregate = new SpotScenes(spotScenesList);

        //实例化旅游景点迭代对象
        sceneIterator = sceneAggregate.iterator();

        //遍历旅游景点信息
        while (sceneIterator.hasNext()) {
            Scene spotScene = sceneIterator.next();
            System.out.println(spotScene.getName()+","+spotScene.getInfo());
        }

    }

}
