package newpractice;


// 1.static methods can access only static stuff(directly - without creating any object)
// NOn static methods can access both static and non static stuff directly
public class StaticExamples {
	
	static int a =10; // static variable
	int b = 20; // non static variable
	
	static void m1() {
//		StaticExamples se = new StaticExamples(); // not good practice
//		System.out.println(se.b);
		System.out.println("this is m1 static method");
	}
	void m2() {
		System.out.println("THis is m2 - non static method");
	}
	
	void m3() {
		System.out.println("this is m3 method which is non static");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) {
		
		System.out.println(a); // static stuff
		//System.out.println(StaticExamples.a);
		m1();
		//StaticExamples.m1();
		//System.out.println(b); // non static stuff
		//m2(); // non static stuff
		
		// 2. static methods can also access non static stuff but through object
		
		StaticExamples se = new StaticExamples();
		System.out.println(se.b); // non static variable through object
		se.m2(); // non static method
		
		se.m3();

	}

}
