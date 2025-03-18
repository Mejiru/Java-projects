public class RegularEmployee extends Employee{
    private int Bonus;

    public RegularEmployee(int a, String b, int c, int d) {
        super(a, b, c);
        Bonus =d;
    }
    public void setBonus(int bonus) {
        Bonus = bonus;
    }
    public String toString(){
        return String.format("The Employee name is: %s\nThe Employee ID is: %d\nThe Employee Salary is: %dSAR\nThe Employee's Bonus is: %dSAR\nThe Employee's total payment is : %dSAR\n",super.getEmpName(),super.getEmpID(),super.getSalary(),Bonus,(Bonus+getSalary()));
    }
}

