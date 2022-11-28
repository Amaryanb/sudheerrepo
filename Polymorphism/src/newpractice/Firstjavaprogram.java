package newpractice;

public class Firstjavaprogram {
	
	//Java Program to replace lower-case characters with upper-case and vice-versa
	
	public static void UpperCaseLowerCase() {
		String s = "HEllO worlD";
		StringBuffer str = new StringBuffer(s);
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				str.setCharAt(i, Character.toLowerCase(s.charAt(i)));
			}
			else if(Character.isLowerCase(s.charAt(i))) {
				str.setCharAt(i, Character.toUpperCase(s.charAt(i)));
			}
			
		}System.out.println(str);
	}

	public static void main(String[] args) {
		// Java Program to count the total number of characters in a string
//		String s = "Amarnath";
//		System.out.println(s.length());
//		Object obj = new Object();
//		UpperCaseLowerCase();
		// palindrome
//		String str = "madam";
//		String rev_str = "";
//		for(int i = str.length()-1;i>=0;--i) {
//			rev_str = rev_str+str.charAt(i);
//		}
//		if(str.toLowerCase().equals(rev_str.toLowerCase())) {
//			System.out.println("pal");
//		}else {
//			System.out.println("not pal");
//		}
		
		// Reverse a given string
//		String s = "hello world",rev_str = "";
//		
//		for(int i=s.length()-1;i>=0;i--) {
//			rev_str = rev_str +s.charAt(i);
//		}
//		System.out.println(rev_str);
		
		// Duplicates in a string
		
//		String s = "hello world, good morning, how are you";
//		char[] carray = s.toCharArray();
//		System.out.println("Duplicate charaters are: ");
//		for(int i=0;i<s.length();i++) {
//			for(int j=i+1;j<s.length();j++) {
//				if(carray[i]==carray[j]) {
//					System.out.println(carray[j] +" ");
//					break;
//				}
//			}
//		}
		
		//Frequency of characters
		String s = "preparation of java program";
		char[] cs = s.toCharArray();
		for(int i=0;i<cs.length;i++) {
			int index = i;
			int count = 0;
			for(int j=0;j<cs.length;j++) {
				if(j==i &&(cs[j]==cs[i])) {
					break;
				}
				if(cs[index]==cs[j]) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(cs[i]+ " "+ count);
			}
			
		}
		}
		
		
	
		
	}
}
