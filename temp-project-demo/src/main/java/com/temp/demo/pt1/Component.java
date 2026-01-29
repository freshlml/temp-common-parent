package com.temp.demo.pt1;

import java.util.List;

public interface Component<E> {
    boolean isLeaf();
    E getEntity();
    List<Component<?>> getAllChild();
    void addChild(Component<?> child);
}
