package BuildPattern;

/**
 * 堡
 */
public abstract class Burger implements Item{

    @Override
    public Package pack() {
        return new Wrap();
    }

    @Override
    public abstract float price();

}
