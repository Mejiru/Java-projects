import java.util.Scanner;
public class Student_test {
    public static void main(String[] args) {
        int c;
        Scanner input = new Scanner(System.in);
        Studentlist a = new Studentlist();
        a.addStudent("Ifu",1895,3.69);
        a.addStudent("Mohammed",1999,3.79);
        a.addStudent("AbdulAziz",2000,3.89);
        a.addStudent("Abdullah",2001,3.3);
        a.addStudent("Ammar",2002,3.8);
        a.addStudent("Zakir",2003,3.79);
        a.PrintAll();
        System.out.println("Enter the id of the student you want to remove: ");
        c=input.nextInt();
        a.deleteStudent(c);
        a.Printall();
        a.PrintStudentInfo(2003);
    }
}