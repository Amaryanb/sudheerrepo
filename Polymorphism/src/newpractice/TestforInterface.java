package newpractice;

interface A
{
	int a=10;// by default  variables in interface are static and final
	
	void m1(); // abstract method , by default this method is public
}


public class TestforInterface  implements A {
	public void m1() {
		System.out.println(a);
	}


	public static void main(String[] args) {
		/*TestforInterface t = new TestforInterface();
		t.m1();*/
		
		A a = new TestforInterface();
		a.m1();

	}

	}
