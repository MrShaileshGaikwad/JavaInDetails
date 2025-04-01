package InterviewQuestion;


class Animal{
	void makeSound() {
		System.err.println("animal make sound");
	}
}

class Dog extends Animal{
	void  bark() {
		System.err.println("dog bark>>");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Animal a= new Animal();
		a.makeSound();
//a.bark(); getting compile time error
		
		Dog d = new Dog();
		
		d.bark();//dog bark>
		d.makeSound();//animal make sound
		


	}

}
