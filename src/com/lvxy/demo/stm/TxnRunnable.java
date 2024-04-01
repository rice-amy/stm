package com.lvxy.demo.stm;

/**
 * @author lvxy
 * @version 1.0
 * @description: TODO
 * @date 2024/4/1 14:28
 */
@FunctionalInterface
public interface TxnRunnable {
    void run(Txn txn);
}
