package BuildPattern;

/**
 * 鸡肉堡
 */
public class HenBurger extends Burger{

    @Override
    public String name() {
        return "henBurger";
    }

    @Override
    public float price() {
        return 3.2f;
    }
}
