package design;

public class TestFactory {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        //新建一个工厂
        FoodFactory foodFactory = new FoodFactory();
        //获取食物
        Foods food1=foodFactory.getFood("chicken");
        Foods food2=foodFactory.getFood("duck");
        Foods food3=foodFactory.getFood("hen");
        if(food1!=null){
            food1.get();
        }
        if(food2!=null){
            food2.get();
        }
        if (food3!=null){
            food3.get();
        }
    }
}
