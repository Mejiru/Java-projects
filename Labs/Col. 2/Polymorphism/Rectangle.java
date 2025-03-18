public class Rectangle extends Shape{
    public Rectangle(double l, double w) {
        super(l, w);
    }
    @Override
    public double Area() {
        return (super.getDim1()*super.getDim2());
    }
}
