package Sample.Automation;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,k;
		for(i=0;i<n;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("  "+"*"+"  ");
			}
			System.out.println();
		}
		for(i=n;i>0;i--) { for(j=i;j>0;j--) { System.out.print(" * "); }
		  System.out.println(); }

	}

}
