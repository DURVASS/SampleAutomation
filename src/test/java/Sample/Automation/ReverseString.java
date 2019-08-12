package Sample.Automation;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String x="";
		char y;
		String j=sc.next();
		for(int i=j.length();i>=1;i--) {
			y=j.charAt(i-1);
			x= x+y;	
		}
		System.out.println("reverse string: "+x);
	}

}
