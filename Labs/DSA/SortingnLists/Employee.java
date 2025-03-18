package list.pos;

public class Employee {
    public int empid;
    public String empName;
    public String Desig;
    public double Salary;

    public Employee(int empid, String empname, String desig, double salary) {
        this.empid = empid;
        this.empName = empname;
        Desig = desig;
        Salary = salary;
    }
    public boolean joined(Employee otherEmployee) {
        return this.empid == otherEmployee.empid;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee employee = (Employee) obj;

        if (Double.compare(employee.empid, empid) != 0) return false;
        if (Double.compare(employee.Salary, Salary) != 0) return false;
        if (!empName.equals(employee.empName)) return false;
        return Desig.equals(employee.Desig);
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesig() {
        return Desig;
    }

    public void setDesig(String desig) {
        Desig = desig;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", desig='" + Desig + '\'' +
                ", empId=" + empid +
                ", salary=" + Salary +
                '}';
    }
}
