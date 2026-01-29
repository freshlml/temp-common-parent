package com.temp.demo.pt1;

import java.util.List;

public interface ComponentResolver<E> {
    boolean isLeaf();
    E getEntity();
    List<Component<?>> getAllChild();
}
