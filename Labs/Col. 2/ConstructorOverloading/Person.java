public class Person {
    private int id;
    private String name;

    static int count = 0;
    public Person()
    {
        id = 1;
        name = "Zikria";
        count++;
    }
    public Person(int id) // Overloaded/Parameterized Constructor
    {
        this.id = id;
        name = "Zikria";
        count++;
    }
    public Person(int id, String name) // Overloaded/Parameterized Constructor
    {
        this.id = id;
        this.name = name;
        count++;
    }
    public Person(Person p) // Copy Constructor
    {
        this.id = p.id;
        this.name = p.name;
        count++;
    }
    public void displayPerson()
    {
        System.out.println("Person Id: "+id+" Person Name: "+name);
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "ID: "+id+" Name: "+name;
    }

    public static int getNumberOfInstance()
    {
        return count;
    }
}
class PersonManagementSystem
{
    int count;
    final int SIZE = 5;
    Person[] persons;
    public PersonManagementSystem()
    {
        persons = new Person[SIZE];
        count = 0;
    }
    public void addPerson(int id, String name)
    {
        if(count < SIZE)
        {
            Person p = new Person(id, name);
            persons[count] = p;
            count++;
        }
        else
        {
            System.out.println("Sorry! The persons array is full!!!");
        }
    }

    public Person removePerson(int id)
    {
        Person temp = null;
        if(count == 0)
        {
            System.out.println("Sorry! The array is empty");
            return null;
        }
        else
        {
            for(int i = 0; i < count;i++)
            {
                if(persons[i].getId() == id)
                {
                    temp = persons[i];
                    persons[i]=persons[i+1];
                    }
                    }
                }
        return temp;
    }
    @Override
    public String toString()
    {
        String str = "Person Management System Members are:\n";
        str += "-------------------------------------\n";
        for(int i = 0; i < SIZE; i++)
        {
            str += persons[i]+"\n";
        }
        return str;
    }
}