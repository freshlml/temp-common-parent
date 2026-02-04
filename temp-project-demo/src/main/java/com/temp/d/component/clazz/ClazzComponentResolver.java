package com.temp.d.component.clazz;

import com.temp.d.component.ComponentResolver;

import java.util.List;

public interface ClazzComponentResolver<T> extends ComponentResolver<Class<T>> {

    List<ClazzComponent<?>> getAllSuperClass();

}
