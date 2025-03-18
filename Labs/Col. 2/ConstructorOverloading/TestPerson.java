public class TestPerson {
    public static void main(String args[])
    {
        PersonManagementSystem pms = new PersonManagementSystem();

        pms.addPerson(111, "Mohammad");
        pms.addPerson(222, "Ahmed");
        pms.addPerson(333, "Ali");
        pms.addPerson(444, "Fahad");
        pms.addPerson(555, "Abdulrahman");

        System.out.println(pms);
        pms.addPerson(666, "Faisal"); // Not added
        System.out.println("The person removed is: "+pms.removePerson(222));
        System.out.println(pms);
    }
}