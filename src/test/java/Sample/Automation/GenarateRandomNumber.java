package Sample.Automation;

import java.util.Random;

public class GenarateRandomNumber {

	public static void main(String[] args) {
		Random ran=new Random();
		int a=ran.nextInt(999);
		System.out.println(a);
		

	}

}
