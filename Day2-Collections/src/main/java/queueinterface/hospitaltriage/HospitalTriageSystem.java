package queueinterface.hospitaltriage;

import java.util.PriorityQueue;
import java.util.Queue;

public class HospitalTriageSystem {
    private static class Patient implements Comparable<Patient> {
        String name;
        int severity;

        public Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }

        @Override
        public int compareTo(Patient other) {
            return Integer.compare(other.severity, this.severity); // Higher severity first
        }

        @Override
        public String toString() {
            return name;
        }
    }

    private final Queue<Patient> priorityQueue;

    public HospitalTriageSystem() {
        priorityQueue = new PriorityQueue<>();
    }

    public void addPatient(String name, int severity) {
        priorityQueue.add(new Patient(name, severity));
    }

    public Queue<String> processPatients() {
        Queue<String> treatmentOrder = new PriorityQueue<>();
        while (!priorityQueue.isEmpty()) {
            treatmentOrder.add(priorityQueue.poll().name);
        }
        return treatmentOrder;
    }
}
