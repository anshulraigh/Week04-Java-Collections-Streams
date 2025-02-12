package queueinterface.hospitaltriage;

public class Main {
    public static void main(String[] args) {
        HospitalTriageSystem triageSystem = new HospitalTriageSystem();
        triageSystem.addPatient("John", 3);
        triageSystem.addPatient("Alice", 5);
        triageSystem.addPatient("Bob", 2);

        System.out.println("Treatment Order: " + triageSystem.processPatients());
    }
}
