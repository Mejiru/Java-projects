import java.util.Scanner;
public class CarApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a,b;
        double c;
        Car c1 = new Car();
        Car c2 = new Car("Hyundai Elantra", "2020", 100000);
        System.out.println("Enter the model of Car 1: ");
        a=input.nextLine();
        c1.setModel(a);
        System.out.println("Enter the year of the model for Car 1: ");
        b=input.nextLine();
        c1.setYear(b);
        System.out.println("Enter the price of Car 1: ");
        c=input.nextDouble();
        c1.setPrice(c);
        System.out.printf("Car 1 Details %nCar Model:%s%nModel Year:%s%nPrice without discount:%.2f SAR%n%n",c1.getModel(),c1.getYear(),c1.getPrice());
        System.out.printf("Car 2 Details %nCar Model:%s%nModel Year:%s%nPrice without discount:%.2f SAR%n%n",c2.getModel(),c2.getYear(),c2.getPrice());
        System.out.println(c1.DisplayPrice1());
        System.out.println((c2.DisplayPrice2()));
    }
}