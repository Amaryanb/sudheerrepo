package newpractice;

public class ThisKeyword {
	
	
	int a,b; // instance variables or class variables
	
//	void getValue(int x, int y) {// method variables or external variables
//		a = x;
//		b = y;
//	}
	void getValue(int a, int b) {
		this.a = a;  // this keyword always points to class variable
		this.b = b;
	}
	
	void printValues() {
		System.out.println(a);
		System.out.println(b);
		
	}
	

	public static void main(String[] args) {
		
		ThisKeyword th = new ThisKeyword();
		th.getValue(10,20);
		th.printValues();
	}

}
