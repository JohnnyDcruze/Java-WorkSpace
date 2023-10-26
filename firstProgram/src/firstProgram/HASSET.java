package firstProgram;
import java.util.*;
public class HASSET {
	public static void main(String []args) {
		
	HashSet<Integer> set=new HashSet<Integer>();  
	set.add(3);  
	set.add(1);  
	set.add(7);  
	set.add(3);  
	//Traversing elements  
	Iterator<Integer> itr=set.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}
}
