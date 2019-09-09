package BuildPattern;

public class Test {
    public static void main(String[] args) {

        ItemList veg=new Order().veg();
        System.out.println("veg");
        veg.showItemList();
        System.out.println(veg.getCost());
    }
}
