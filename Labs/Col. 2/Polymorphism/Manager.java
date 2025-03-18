public class Manager extends Employee{
    private int transportation;
    public int housing;
    public Manager(int a, String b, int c, int d, int e) {
        super(a, b, c);
        transportation =d;
        housing=e;
    }

    public void setTransportation(int transportation) {
        this.transportation = transportation;
    }

    public void setHousing(int housing) {
        this.housing = housing;
    }

    public String toString(){
        return String.format("The Employee name is: %s\nThe Employee ID is: %d\nThe Employee's Salary is: %dSAR\nThe Employee's transportation allowance is: %dSAR\nThe Employee's housing insurance is: %dSAR\nThe Employee's total payment is: %dSAR\n",super.getEmpName(),super.getEmpID(),super.getSalary(),transportation,housing,(transportation+housing+super.getSalary()));
    }
}
