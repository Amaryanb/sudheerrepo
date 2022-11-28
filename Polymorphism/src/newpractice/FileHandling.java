package newpractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileReader fr = null;
		fr = new FileReader(" path");
		
		BufferedReader bfr = new BufferedReader(fr);
		System.out.println(bfr.readLine());
		
		Thread.sleep(3000);

	}

}
