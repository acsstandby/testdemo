package lamda;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Test1 {
    public static void main(String[] args) {
        Runnable r1=()-> System.out.println("hello");
        Thread t1=new Thread(r1);
        t1.start();
        Callable c1=new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("hello");
                return 1;
            }
        };
        FutureTask f1=new FutureTask(c1);
        Thread t2=new Thread(f1);
        t2.start();


    }
}
