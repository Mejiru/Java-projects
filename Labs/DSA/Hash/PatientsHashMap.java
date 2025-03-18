import java.util.*;
public class PatientsHashMap {
    public static void main(String[] args) {
        HashMap<String, Patient> patients = new HashMap<>();
        Patient patient1 = new Patient("P1", "John Doe", "2023-01-15", "Fever", 99, 150);
        Patient patient2 = new Patient("P2", "Jane Smith", "2023-02-20", "Headache", 98, 130);

        patients.put(patient1.getId(), patient1);
        patients.put(patient2.getId(), patient2);


        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a patient ID: ");
            String patientId = scanner.next();

            Patient patient = patients.get(patientId);
            if (patient != null) {
                System.out.println(patient);
            } else {
                System.out.println("Patient not found.");
            }
        }

        System.out.println("Patient Information: " + patients);
        System.out.println("HashMap size: " + patients.size());

        String patientIdToRemove = "P1";
        patients.remove(patientIdToRemove);

        for (String key : patients.keySet()) {
            System.out.println(key);
        }

        for (Patient patientValue : patients.values()) {
            System.out.println(patientValue);
        }

        patients.clear();
    }
}
