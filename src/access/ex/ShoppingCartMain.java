package access.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();

    Item item1 = new Item("마늘",2000,3);
    Item item2 = new Item("상추",5000,6);

    cart.addItem(item1);
    cart.addItem(item2);

    cart.displayItem();
    }
}