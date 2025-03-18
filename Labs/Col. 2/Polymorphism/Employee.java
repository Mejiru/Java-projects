public class Employee {
    private int EmpID;
    private String EmpName;
    private int Salary;
    public Employee(int a,String b, int c ){
        EmpID=a;
        EmpName=b;
        Salary=c;
    }

    public int getEmpID() {
        return EmpID;
    }

    public void setEmpID(int empID) {
        EmpID = empID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
    public String PrintEmployee(){
        return String.format("The Employee name is: %s\nThe Employee ID is: %d\n",EmpName,EmpID);
    }
}
