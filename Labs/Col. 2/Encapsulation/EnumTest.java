/*
Name: Irfan Bin Islam
ID: 202200144
Section: CS||101
Assignment 1
 */
import java.util.EnumSet;
public class EnumTest {
    public static void main(String[] args) {
        Book.values();
        System.out.printf("Book=%s%n",Book.JHTP);
        System.out.printf("Title=%s%n",Book.JHTP.getTitle());
        System.out.printf("CopyrightYear=%s%n",Book.JHTP.getYear() );
        System.out.println("****************************************************");
        System.out.printf("Book=%s%n",Book.IW3HTP);
        System.out.printf("Title=%s%n",Book.IW3HTP.getTitle());
        System.out.printf("CopyrightYear=%s%n",Book.IW3HTP.getYear() );
        System.out.println("****************************************************");
        System.out.printf("Book=%s%n",Book.CSHARPHTP);
        System.out.printf("Title=%s%n",Book.CSHARPHTP.getTitle());
        System.out.printf("CopyrightYear=%s%n",Book.CSHARPHTP.getYear() );
        System.out.println("****************************************************");
        }
    }