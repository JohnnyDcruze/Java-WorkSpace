import java.util.*;
public class arraylist {

	public static void main(String[] args) {
		Student student=new Student();
		
		student.setNames();
		student.searchNames("johnny");
		student.searchIndex(2);
		student.printNames();
		student.removeName("yogesh");
		
		student.printNames();
		}
}

 class Student {
	private ArrayList <String> names = new ArrayList<>();
	public void setNames() {
		names.add("Kishore");
		names.add("yogesh");
		names.add("johnny");
	}
	public void searchNames(String name) {
		if(names.contains(name)) {
			System.out.println("Found in list");
		}
		else {
			System.out.println("Not Found in list");
		}
	}
	public void searchIndex (int index) {
		if(index>=0 && index<names.size())
		System.out.println("Index"+index+ "at "+names.get(index));
		else {
			System.out.println("Invalid index");

		}
	}
	public void printNames() {
		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	public void removeName(String stuName) {
		if (names.contains(stuName)) {
			names.remove(stuName);
			System.out.println("Removed");
		}
		else {
			System.out.println("not found");
		}
	}
}
