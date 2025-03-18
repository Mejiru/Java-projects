import java.util.*;
public class Shape {
    private double dim1;
    private double dim2;
    public Shape(double a,double b){
        dim1 = a;
        dim2 = b;
    }

    public double getDim1() {
        return dim1;
    }

    public void setDim1(double dim1) {
        this.dim1 = dim1;
    }

    public double getDim2() {
        return dim2;
    }

    public void setDim2(double dim2) {
        this.dim2 = dim2;
    }

    public double Area(){
        System.out.print("Area for the shape is undefined");
        return 0.0;
    }
    }