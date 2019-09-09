package lock;

public class DTDemo2 {
    public static void main(String[] args) {
            DTTest d0=new DTTest(0);
            DTTest d1=new DTTest(1);
            new Thread(d0).start();
            new Thread(d1).start();
    }
}
class DTTest implements Runnable{
    private int value;
    private static Object pen=new Object(),papper=new Object();

    public DTTest(int value) {
        this.value = value;
    }

    @Override
    public void run() {
        if (value==1){
            synchronized (pen){
                System.out.println("张三拿到笔");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (papper){
                    System.out.println("张三拿到纸");
                }
            }


        }
        if(value==0){
            synchronized (papper){
                System.out.println("李四拿到纸");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (pen){
                    System.out.println("李四拿到笔");
                }
            }


        }
    }
}

