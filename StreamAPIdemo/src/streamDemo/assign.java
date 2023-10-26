package streamDemo;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class assign {

	public static void main(String[] args) {
		List <Integer> Numbers=new ArrayList<Integer>();
		Numbers.add(8);
		Numbers.add(7);
		Numbers.add(6);
		Numbers.add(5);
		Numbers.add(6);
		
		System.out.println("1. Answer : ");
		
		Double average=Numbers.stream().collect(Collectors.averagingInt(Integer::intValue));
		System.out.println(average+"\n");
		
		System.out.println("2. Answer : ");
		
		List <String> strings=new ArrayList<String>();
		strings.add("Johnny");
		strings.add("Yogesh");
		strings.add("Kishore");
		strings.add("Sriram");
		strings.add("Jagadish");
		
		List<String> upperCase=new ArrayList<String>();
		
		upperCase=strings.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperCase);
		
		List<String> LowerCase=new ArrayList<String>();
		
		LowerCase=strings.stream().map(String::toLowerCase).collect(Collectors.toList());
		System.out.println(LowerCase+"\n");
		
		System.out.println("3. Answer : ");
		
		int evenSum=Numbers.stream().filter(number->number%2==0).mapToInt(Integer::intValue).sum();
		System.out.println("EVEN SUM : "+evenSum);
		int oddSum=Numbers.stream().filter(number->number%2!=0).mapToInt(Integer::intValue).sum();
		System.out.println("ODD SUM :"+oddSum);
		
		System.out.println("\n4. Answer :");
		List<Integer> result=Numbers.stream().distinct().toList();
		System.out.println(result);
		
		System.out.println("\n5. Answer :");
		long count = strings.stream().filter(e -> e.startsWith("J")).count();
		System.out.println(count);
		
		System.out.println("\n6. Answer :");
		 List<String> asc=strings.stream().sorted().collect(Collectors.toList());
	     List<String> desc=strings.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	     System.out.println(asc);
	     System.out.println(desc);
	     
	     System.out.println("\n7. Answer :");
	     
	     int minimum = Numbers.stream().min(Integer::compare).orElse(null);
	     int maximum = Numbers.stream().max(Integer::compare).orElse(null);
	     System.out.println("min Value "+minimum);
	     System.out.println("max Value "+maximum);
	     
	     System.out.println("\n8. Answer :");
	     List<Integer> sortedNumbers = Numbers.stream().sorted().collect(Collectors.toList());
	     int secondMinimum=sortedNumbers.get(1);
	     int secondMaximum=sortedNumbers.get(sortedNumbers.size()-2);
	     System.out.println("secondMinimum "+secondMinimum);
	     System.out.println("SecondMaximum "+secondMaximum);
	     
	}

}
