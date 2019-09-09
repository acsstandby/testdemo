package design;
//单例
public class SingleMode {
    //静态创建一个对象
    private static SingleMode ss=new SingleMode();
    //私有化构造方法
    private SingleMode() {
    }
    //创建静态方法提供Single对象
    public static SingleMode getSingle(){
        return ss;
    }
    //hello
    public void hello(){
        System.out.println("hello");
    }
}
