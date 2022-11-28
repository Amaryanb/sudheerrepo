package newpractice;
// final method cannot be overridden in child class
public class FinalVariableDemo {
	
	//int speed = 40;
	//final int speed = 40; // final variable - cannot change this value

	public static void main(String[] args) {
		FinalVariableDemo fv = new FinalVariableDemo();
		fv.speed = 100;
		System.out.println(fv.speed);

	}

}
