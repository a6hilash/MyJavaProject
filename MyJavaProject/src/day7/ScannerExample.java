package day7;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
//	int a = 10;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a name: ");
//	int a = sc.nextInt(); //for integer
	
//	double num = sc.nextDouble(); //for decimal value
	
	String s = sc.next();
	
	
	System.out.println("the name is " + s);

	}

}
