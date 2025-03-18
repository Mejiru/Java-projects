public class Rectangle2 implements shape2 {
    private double length;
    private double width;
    public Rectangle2(double a, double b){
        length=a;
        width=b;
    }

    @Override
    public double Area() {
        return (length*width);
    }

    @Override
    public double Perimeter() {
        return (2*(length+width));
    }
}
