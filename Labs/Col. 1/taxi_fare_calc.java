/*
This prog. is used to calculate the taxi fare at a rate of $1.5 per mile.
Name: Irfan Bin Islam
PMU ID: 202200144
Course: Computer Science 101
 */
import java.util.Scanner;
public class Taxi_fare_calc {
    public static void main(String[] args) {
        double miles, fare;
        Scanner input = new Scanner(System.in);
        System.out.println("Taxi Fare Calculator\nEnter the distance traveled in miles: ");
        miles = input.nextDouble();
        fare = 1.5 * miles;
        System.out.printf("Your fare is $%.2f", fare);
    }
}