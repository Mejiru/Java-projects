public class Triangle extends Shape{
    public Triangle(double l,double h){
        super (l,h);
    }

    @Override
    public double Area() {
        return (0.5*super.getDim1()*super.getDim1());
    }
}
