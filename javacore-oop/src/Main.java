import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("T-shirt", 5, 100);
        Item item2 = new Item("Pants", 4, 200);
        Item item3 = new Item("Shoes", 3, 300);
        Item item4 = new Item("Hat", 2, 400);
        Item item5 = new Item("Socks", 1, 500);
        Item item6 = new Item("Jacket", 5, 600);
        Item item7 = new Item("Gloves", 4, 700);
        Item item8 = new Item("Scarf", 3, 800);
        Item item9 = new Item("Underwear", 2, 900);
        Item item10 = new Item("Sweater", 1, 1000);

        Category category1 = new Category("Clothes", new ArrayList<>());
        Category category2 = new Category("Shoes", new ArrayList<>());
        Category category3 = new Category("Accessories", new ArrayList<>());

        category1.addItem(item1);
        category1.addItem(item2);
        category2.addItem(item3);
        category3.addItem(item4);
        category1.addItem(item5);
        category1.addItem(item6);
        category3.addItem(item7);
        category3.addItem(item8);
        category1.addItem(item9);
        category1.addItem(item10);

        User user = new User("login", "password", new Basket(new ArrayList<>()));

        user.addItem(item1);
        user.addItem(item2);

        user.showBasket();
    }
}