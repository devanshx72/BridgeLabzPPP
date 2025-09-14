public class InventoryItem {
    private int itemCode;
    private String itemName;
    private double price;

    public InventoryItem(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void display() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    public double totalCost(int quantity) {
        return quantity * price;
    }

    public static void main(String[] args) {
        InventoryItem item = new InventoryItem(1, "Pen", 10.0);
        item.display();
        System.out.println("Total Cost (for 5): " + item.totalCost(5));
    }
}
