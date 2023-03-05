public class User {
    private String login;
    private String password;
    private Basket basket;

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public void addItem(Item item) {
        basket.addItem(item);
    }

    public void removeItem(Item item) {
        basket.removeItem(item);
    }

    public void clearBasket() {
        basket.clear();
    }

    public void showBasket() {
        basket.show();
    }

}
