package newpractice;

public class ConstructorOverloading {

	ConstructorOverloading(int a, int b){
		System.out.println(a+b);
	}
	ConstructorOverloading(int a, double b){
		System.out.println(a+b);
	}
	ConstructorOverloading(double a, int b, int c){
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		ConstructorOverloading ao = new ConstructorOverloading(10,20);
		ConstructorOverloading bo = new ConstructorOverloading(10,20.6);
		ConstructorOverloading co = new ConstructorOverloading(10,20,30);
	
	
}}
