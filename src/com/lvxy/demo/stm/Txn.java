package com.lvxy.demo.stm;

/**
 * @author lvxy
 * @version 1.0
 * @description: 事务接口
 * @date 2024/4/1 14:27
 */
public interface Txn {
    <T> T get(TxnRef<T> ref);
    <T> void set(TxnRef<T> ref, T value);
}