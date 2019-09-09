package DecoratorPattern;

public class Test {
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.draw();
        DecShape c2= new RedDec(new Circle());
        c2.draw();

    }
}
