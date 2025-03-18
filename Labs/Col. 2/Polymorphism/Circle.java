public class Circle implements shape{
    private double radius;
    public Circle(double a){
        radius =a;
    }
    public double Area(){
        return (Math.PI*Math.pow(radius,2.0));
    }
    public double Perimeter() {
        return (2 * Math.PI * radius);
    }
}
