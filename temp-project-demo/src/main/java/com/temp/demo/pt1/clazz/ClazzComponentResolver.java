package com.temp.demo.pt1.clazz;

import com.temp.demo.pt1.ComponentResolver;

import java.util.List;

public interface ClazzComponentResolver<T> extends ComponentResolver<Class<T>> {

    List<ClazzComponent<?>> getAllSuperClass();

}
