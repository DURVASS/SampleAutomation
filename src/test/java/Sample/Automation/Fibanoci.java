package Sample.Automation;

import java.util.Scanner;

public class Fibanoci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		int i=0,j=1,m=0;
		
		for(int k=0;k<=y;k++) {
			System.out.println(i+" ");
			m=i+j;
			i=j;
			j=m;
		}
		

	}

}























































































































































































