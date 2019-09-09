package design;
/**
 * 食物工厂
 */
public class FoodFactory {
    public Foods getFood(String food) throws IllegalAccessException, InstantiationException {
        if (food.equals("chicken")){
           return Chicken.class.newInstance();
        }
        if (food.equals("duck")){
            return Duck.class.newInstance();
        }
        else{
            System.out.println("没有该食物");
            return null;
        }
    }
}
