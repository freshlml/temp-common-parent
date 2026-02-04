package com.temp.d.component;

import java.util.List;

public interface Component<E> {
    boolean isLeaf();
    E getEntity();
    List<Component<?>> getAllChild();
    void addChild(Component<?> child);
}
