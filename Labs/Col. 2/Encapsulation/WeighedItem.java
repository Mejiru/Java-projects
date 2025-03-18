public class WeighedItem extends PurchaseItem {
    private double weight;

    public WeighedItem(String a, double b, double c) {
        super(a, b);
        weight = c;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return (super.getPrice() * weight);
    }

    public String toString() {
        return String.format("%s  %.2f Kg  %.2f SR", super.Print(), getWeight(), getPrice());
    }
}