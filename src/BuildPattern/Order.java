package BuildPattern;

import java.util.List;

/**
 * 组合
 */
public class Order{
    public ItemList veg(){
        ItemList list=new ItemList();
        list.addItem(new VegBurger());
        list.addItem(new Pop());
        return list;

    }

    public ItemList hen(){
        ItemList list=new ItemList();
        list.addItem(new HenBurger());
        list.addItem(new Coke());
        return list;
    }


}
