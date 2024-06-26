package com.lvxy.demo.stm;

/**
 * @author lvxy
 * @version 1.0
 * @description: 支持事务的引用
 * @date 2024/4/1 14:26
 */
public class TxnRef<T> {
    //当前数据，带版本号
     volatile VersionedRef curRef;
    //构造方法
    public TxnRef(T value) {
        this.curRef = new VersionedRef(value, 0L);
    }
    //获取当前事务中的数据
    public T getValue(Txn txn) {
        return txn.get(this);
    }
    //在当前事务中设置数据
    public void setValue(T value, Txn txn) {
        txn.set(this, value);
    }
}