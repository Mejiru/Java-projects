public class TestPolymorphism {
    public static void main(String[] args) {
        Employee r = new RegularEmployee(1110,"Mohammed",8000,200);
        Manager m = new Manager(12131,"Ahmed",40000,600,4000);
        System.out.println(r);
        System.out.println(m);
        m.setEmpID(111111);
        m.setEmpName("Misa");
        m.setHousing(2000);
        m.setTransportation(300);
        m.setSalary(50000);
        System.out.println(m);
    }
}
