public class CountedItem extends PurchaseItem {
    private int quantity;

    public CountedItem(String a, double b, int c) {
        super(a, b);
        quantity = c;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return (super.getPrice() * getQuantity());
    }

    public String toString() {
        return String.format("%s   %d units   %.2f SR", super.Print(), getQuantity(), getPrice());
    }
}