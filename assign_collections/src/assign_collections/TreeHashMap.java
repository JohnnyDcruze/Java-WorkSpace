package assign_collections;
import java.util.*;
public class TreeHashMap {

	public static void main(String[] args) {
	     Employee employee = new Employee();
	        employee.setNames();
	        System.out.println("Employee names:");
	        employee.printNames();
	        employee.getName("1");
	        System.out.println("Employee names using keySet:");
	        employee.printNamesKeySet();
	        employee.printSize();
	        employee.remove("3");
	        System.out.println("Updated employee names:");
	        employee.printNames();
	    }
	}

	class Employee {
	    private HashMap<String, String> empNames = new HashMap<>();

	    public void setNames() {
	        empNames.put("1", "Johnny");
	        empNames.put("2", "Yogesh");
	        empNames.put("3", "Kishore");
	    }

	    public void printNames() {
	        for (Map.Entry<String, String> entry : empNames.entrySet()) {
	            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
	        }
	    }

	    public void getName(String key) {
	        if (empNames.containsKey(key)) {
	            System.out.println("Name for Roll No " + key + ": " + empNames.get(key));
	        } else {
	            System.out.println("Roll No " + key + " not found");
	        }
	    }

	    public void printNamesKeySet() {
	        Set<String> keys = empNames.keySet();
	        for (String key : keys) {
	            System.out.println("Name: " + empNames.get(key));
	        }
	    }

	    public void printSize() {
	        System.out.println("Size of the HashMap: " + empNames.size());
	    }

	    public void remove(String key) {
	        if (empNames.containsKey(key)) {
	            empNames.remove(key);
	            System.out.println("Roll No " + key + " has been removed");
	        } else {
	            System.out.println("Roll No " + key + " not found");
	        }
	    }

}
