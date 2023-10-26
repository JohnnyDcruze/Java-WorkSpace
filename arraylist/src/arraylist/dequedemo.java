package arraylist;
import java.util.*;

public class dequedemo {

	public static void main(String[] args) {
		Hashtable<String, Integer> hashtable = new Hashtable<>();
		  hashtable.put("key1", null);
	        hashtable.put("key2", 42);

	        // Retrieving values
	        Integer value1 = hashtable.get("key1"); // This will be null
	        Integer value2 = hashtable.get("key2"); // This will be 42

	        System.out.println("Value1: " + value1); // Value1: null
	        System.out.println("Value2: " + value2); 

	}

}
