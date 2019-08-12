package Sample.Automation;
import java.util.Scanner;
public class FindNumberOfKeys {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		String a="sandeep";
		String x[]=a.split("");
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x.length;j++) {
				if(x[i].equals(x[j])) {
					count++;
				}
			}
			System.out.println("The key come of number of times"+x[i]+""+count);
			count=0;
		}		
	}

}
