public class Studentlist {
    class Node {
        String sname;
        int id;
        double gpa;
        Node next;

        public Node(String a, int b, double c) {
            sname = a;
            id = b;
            gpa = c;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addStudent(String a, int b, double c) {
        Node s = new Node(a, b, c);
        if (head != null) {
            tail.next = s;
            tail = s;
        } else {
            head = s;
            tail = s;
        }
    }

    public Node findStudent(int b) {
        Node curr = head;
        while (curr != null) {
            if (curr.id == b)
                return curr;
            curr = curr.next;
        }
            return curr;
    }
    public void deleteStudent(int b){
        if (findStudent(b)==null) System.out.println("The Student with ID " +b+ " is not in the list\n");
        while(head!=null&&head.id==b){
            head = head.next;}
        Node curr = head;
        while(curr!=null&& curr.next!=null){
            if (curr.next.id==b){
                curr.next=curr.next.next;}
            else curr=curr.next;
            }
    }
        public void PrintAll() {
            int count = 1;
            Node z = head;
            if (head == null) System.out.println("The list is empty.");
            while (z != null) {
                System.out.println("Student #" +count+ ": "  +z.sname);
                z = z.next;
                count += 1;
            }
            System.out.println();
        }
        public void PrintStudentInfo(int b){
        Node n = findStudent(b);
            System.out.printf("Student Name: %s%nStudent ID: %d%nStudent G.P.A: %.2f%n",n.sname,n.id,n.gpa);
            }
}