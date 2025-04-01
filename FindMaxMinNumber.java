package InterviewQuestion;

public class FindMaxMinNumber {
@SuppressWarnings("finally")
public static int test1() {
	 try {
         throw new NullPointerException("From try");
     } catch (Exception e) {
         throw new IllegalArgumentException("From catch");
     } finally {
         throw new ArithmeticException("From finally");
     }
}
	public static int test() {
		// TODO Auto-generated method stub

		 try {
	            return 10;
	        } finally {
	            System.out.println("Executing finally");
	        }
	}
	
	public static void main(String[] args) {
		System.err.println(test());
	}
}
