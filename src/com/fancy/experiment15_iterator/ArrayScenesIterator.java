package com.fancy.experiment15_iterator;

public class ArrayScenesIterator implements SceneIterator {
    private CampusScenes campusScenes;  //维持对具体聚合类的引用
    private int cursor;

    public ArrayScenesIterator(CampusScenes campusScenes) {
        this.campusScenes = campusScenes;
        cursor = 0;
    }

    @Override
    public Scene next() {
        return campusScenes.getCampusScenesArray()[cursor++];
    }

    @Override
    public boolean hasNext() {
        return cursor < campusScenes.getCampusScenesArray().length
                && campusScenes.getCampusScenesArray()[cursor] != null;
    }
}
