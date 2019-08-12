package Sample.Automation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColectList {

	public static void main(String[] args) {
		List a=new ArrayList<Object>();
		a.add("Sandeep");
		a.add(1);
		a.add("Karthik");
		a.add(123);
		a.add("Kalyan");
		a.add(123456789);
		a.add("Hitech City");
		Object ob=null;
		Iterator it =a.iterator();
		while(it.hasNext()) {
			ob=it.next();
			System.out.println(ob);
		}
		
	}

}
