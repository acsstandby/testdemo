package BuildPattern;

/**
 * 冷饮
 */
public abstract class ColdDrink implements Item{
    @Override
    public Package pack() {
        return new Bottle();
    }
    public abstract float price();

}
