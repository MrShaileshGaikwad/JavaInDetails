package InterviewQuestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.HashSet;
import java.util.Set;

public class Ex {
	 public static void main(String[] args) {
	        
//	     List<String>  f= Arrays.asList("apple", "banana", "pear", "orange");
//	        Optional<String> g= f.stream().filter(i->i.length()>5).findFirst();
//	        		//.collect(Collectors.groupingBy(String::length));
//	        
//	        
//	        
//	        System.out.println(g);
	        
		 
		 
		 String s1 = "apple";
	        String s2 = "grape";
	        
	        Set <Character> set= s1.chars().mapToObj(c->(char)c).collect(Collectors.toSet());
	        Set <Character> common=s2.chars().mapToObj(c->(char)c).filter(set::contains).collect(Collectors.toSet());
	        System.err.println(common);
	        
	        
	        int[] array1 = {3, 1, 7, 5};
	        int[] array2 = {8, 2, 6, 4};
	        
	        int [] merge=IntStream.concat(Arrays.stream(array1),Arrays.stream(array2)).sorted().toArray();
	        System.err.println(Arrays.toString(merge));
	        
}
}
