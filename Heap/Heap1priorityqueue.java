import java.util.*;  

public class Heap1priorityqueue {

    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;  
        }
    }

    public static void main(String args[]) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        System.out.println("Max-Heap (Integers):");
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }

        PriorityQueue<Student> studentPQ = new PriorityQueue<>();
        studentPQ.add(new Student("A", 4));
        studentPQ.add(new Student("B", 2));
        studentPQ.add(new Student("C", 1));

        System.out.println("\nMin-Heap (Students by rank):");
        while (!studentPQ.isEmpty()) {
            Student s = studentPQ.remove();
            System.out.println(s.name + " -> rank: " + s.rank);
        }
    }
}
