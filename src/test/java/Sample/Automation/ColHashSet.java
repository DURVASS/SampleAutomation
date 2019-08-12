package Sample.Automation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColHashSet {

	public static void main(String[] args) {
		Set<Object> set=new HashSet<Object>();
		set.add("Sandeep");
		set.add(1);
		set.add("Sandhya");
		set.add(12345);
		set.add("padhma");
		set.add("prabhakar");
		set.add(23456789);
		set.add("Narayanamma");
		set.add("Sandeep");
		set.add("Kalyan");
		set.add("Kalyan");
		Object obj=new Object();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			obj=itr.next();
			System.out.println(obj);
		}
	}

}
