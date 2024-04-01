package com.lvxy.demo.stm;

/**
 * @author lvxy
 * @version 1.0
 * @description: 带版本号的对象引用
 * @date 2024/4/1 14:25
 */
public final class VersionedRef<T> {
    final T value;
    final long version;
    //构造方法
    public VersionedRef(T value, long version) {
        this.value = value;
        this.version = version;
    }
}