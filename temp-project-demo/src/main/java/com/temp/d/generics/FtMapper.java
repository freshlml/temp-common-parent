package com.temp.d.generics;

public interface FtMapper<T> {
    int updateById(T entity);
}
