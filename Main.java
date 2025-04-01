package InterviewQuestion;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
//Input: s = "abcdxyzxb"
//Output: 7


import java.util.HashMap;
import java.util.stream.IntStream;    
class Main {
 
 public  static String findLongestSubstring(String s)
{
 HashMap<Character,Integer> map= new HashMap<>();
  final int []  left ={0}, maxLenth={0}, start={0};
  IntStream.range(0,s.length()).forEach(right->{
      if(map.containsKey(s.charAt(right))){
          left[0]=Math.max(left[0],map.get(s.charAt(right))+1);}
          map.put(s.charAt(right),right);
          if(right-left[0]+1 > maxLenth[0]){
              maxLenth[0]= right- left[0]+1;
              start[0]=left[0];
          }  
          });
          return s.substring(start[0],start[0]+maxLenth[0]);
}    
 
 public static void main(String[] args) {
     System.out.println("Try programiz.pro");

String s1 = "abcdxyzxb";
System.out.println(findLongestSubstring(s1));
String s2="abcdabcbbxyzt";
System.out.println(findLongestSubstring(s2));
String s3="pwwkew";
System.out.println(findLongestSubstring(s3));







 }
}
