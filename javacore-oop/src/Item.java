public class Item {
    private String name;
    private int rating;
    private int price;

    public Item(String name, int rating, int price) {
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
