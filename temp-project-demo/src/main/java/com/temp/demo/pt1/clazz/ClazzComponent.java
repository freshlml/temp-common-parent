package com.temp.demo.pt1.clazz;

import com.temp.demo.pt1.AbstractComponent;

public class ClazzComponent<T> extends AbstractComponent<Class<T>> {

    public ClazzComponent(Class<T> entity) {
        super(entity);
    }

    public ClazzComponent(Class<T> entity, boolean isLeaf) {
        super(entity, isLeaf);
    }

}
