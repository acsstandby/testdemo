package BuildPattern;

/**
 * 可乐
 */
public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 1.2f;
    }
}
