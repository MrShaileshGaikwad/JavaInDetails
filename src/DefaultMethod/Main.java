package DefaultMethod;

// default method in java interface

interface Vehicle{
	default void start() {
		System.err.println("vehicle is starting>>");
	}
	
	
}

class Car implements Vehicle{
	 public void drive() {
	        System.out.println("Car is driving...");
	    }
	
}
public class Main {
	public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start(); // Calls default method from the interface

}}
