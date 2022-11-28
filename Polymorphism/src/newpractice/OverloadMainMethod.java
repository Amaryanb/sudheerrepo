package newpractice;

public class OverloadMainMethod {

	
	// we can create main methods before or after the actual main method
	
	public void  main(int x) {
		System.out.println(x);
	}
	public void main(int x, int y) {
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
		
		OverloadMainMethod mo = new OverloadMainMethod();
		mo.main(100);
		mo.main(10,30);
		

	}

}
