package Oops;

public class Abstraction {
public static void main(String[] args) {
	Vehicle mycar=  new Car();
	
	mycar.start();
mycar.stop();
	
}
}

abstract class Vehicle{
	 abstract void start(); //abstract method
	 
	 void stop() {    //concrete method
		 System.err.println("vehicle stoppeed>>>");
	 }
}

class Car extends  Vehicle{
	@Override
	void start() {
		System.err.println("car is started?>>>");
	}
}