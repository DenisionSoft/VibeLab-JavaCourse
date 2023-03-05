import java.util.List;

public class Basket {
    private List<Item> items;

    public Basket(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void clear() {
        items.clear();
    }

    public void show() {
        for (Item item : items) {
            System.out.println(item.getName() + " " + item.getPrice());
        }
    }
}

