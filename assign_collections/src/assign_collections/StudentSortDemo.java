package assign_collections;
import java.util.*;
public class StudentSortDemo {

	public static void main(String[] args) {
	    ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Students(101, "Johnny"));
        studentList.add(new Students(102, "yogesh"));
        studentList.add(new Students(103, "Kishore"));
        studentList.add(new Students(104, "Sriram"));
        studentList.add(new Students(105, "Guna"));
        
        System.out.println("Unsorted Student Data:");
        for (Student student : studentList) {
            System.out.println(student);
        }
        
        Collections.sort(studentList);

        System.out.println("\nSorted Student Data:");
        for (Student student : studentList) {
            System.out.println(student);
        }

	}

}
class Students implements Comparable<Student> {
    private int rollNo;
    private String name;

    public Students(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

	public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.name.compareTo(otherStudent.getName());
    }
}
