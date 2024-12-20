package com.fancy.experiment15_iterator;

public class ListScenesIterator implements SceneIterator{
    private SpotScenes spotScenes;
    private int cursor;

    public ListScenesIterator(SpotScenes spotScenes) {
        this.spotScenes = spotScenes;
        cursor = 0;
    }

    @Override
    public Scene next() {
        return spotScenes.getSpotScenesList().get(cursor++);
    }

    @Override
    public boolean hasNext() {
        return cursor < spotScenes.getSpotScenesList().size();
    }
}
