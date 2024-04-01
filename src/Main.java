import com.lvxy.demo.stm.Account;

import javax.security.auth.login.AccountException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author lvxy
 * @version 1.0
 * @description: 转账测试
 * @date 2024/4/1 14:40
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //A 余额 1000
        //B 余额 1000
        //C 余额 100
        // A->C转账200 B->C 转账500 结果 A余额800 B余额500 C余额100
        Account A = new Account(1000);
        Account B = new Account(800);
        //Account C = new Account(100);

        A.transfer(B, 100);
        A.transfer(B, 200);
        //B.transfer(C, 500);
        Thread.sleep(5000);
        System.out.println("b.blance:" + B.toString());
    }


}
