package com.fancy.experiment15_iterator;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class SpotScenes implements SceneAggregate{
    protected List<Scene>  spotScenesList;

    public SpotScenes(List<Scene> spotScenesList) {
        this.spotScenesList = spotScenesList;
    }

    public List<Scene> getSpotScenesList() {
        return spotScenesList;
    }

    @Override
    public void add() {
        System.out.println("添加景点");
    }

    @Override
    public void remove() {
        System.out.println("删除景点");

    }

    @Override
    public SceneIterator iterator() {
        return new ListScenesIterator(this);
    }
}
