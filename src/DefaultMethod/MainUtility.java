package DefaultMethod;

interface Utility{
	
	static int add (int a,int b) {
		return a +b;
	}
}


public class MainUtility {
public static void main(String[] args) {
	System.err.println(Utility.add(3, 6));
}
}
