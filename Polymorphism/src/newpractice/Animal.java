package newpractice;

public class Animal {

	String color = "white";
	
	void eating() {
		System.out.println("eating .......");
	}
	Animal(){
		System.out.println("Animal is created");
	}
}
class Dog extends Animal{
	String color = "Black";
	/*void displaycolor() {
		System.out.println(color);
		System.out.println(super.color);
	}*/
	/*void eating() {
		System.out.println("eating food .......");
		super.eating();
	}*/
	Dog(){
		super(); // invokes parent class constructor
		//System.out.println("Dog is created");
	}
}
