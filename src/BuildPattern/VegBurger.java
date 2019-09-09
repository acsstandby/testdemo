package BuildPattern;

/**
 * 蔬菜堡
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "vegBurger";
    }

    @Override
    public float price() {
        return 2.5f;
    }
}
