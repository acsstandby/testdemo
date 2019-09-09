package DecoratorPattern;
//装饰图形
public abstract class DecShape implements Shape {
    protected Shape shape;

    public DecShape(Shape shape) {
        this.shape = shape;
    }


}
