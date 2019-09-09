package DecoratorPattern;
//红色装饰
public class RedDec extends DecShape {
    public RedDec(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRed(shape);

    }
    public void setRed(Shape shape){
        System.out.println("color:red");
    }

}
