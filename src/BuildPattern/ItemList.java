package BuildPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合表单
 */
public class ItemList {
    private List<Item> itemList=new ArrayList<>();
    //添加商品
    public void addItem(Item item){
        itemList.add(item);
    }
    public Float getCost(){
        Float cost=0f;
        for (Item it:
             itemList) {
            cost+=it.price();
        }
        return cost;
    }
    public void showItemList(){
        for (Item i:itemList
             ) {
            System.out.println("名字"+i.name());
            System.out.println("包装"+i.pack().packing());
            System.out.println("价格"+i.price());
        }
    }


}
