public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int q) {
        quantity += q;
    }

    public void removeItem(int q) {
        if (q <= quantity) quantity -= q;
    }

    public void displayTotalCost() {
        System.out.println("Item: " + itemName);
        System.out.println("Unit Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem ci = new CartItem("Notebook", 40, 3);
        ci.addItem(2);
        ci.removeItem(1);
        ci.displayTotalCost();
    }
}
