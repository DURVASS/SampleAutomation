package Sample.Automation;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ColectLLinkedHashSet {

	public static void main(String[] args) {
		Set<Object> set=new LinkedHashSet<Object>();
		set.add("Sandeep");
		set.add("sandhya");
		set.add("Kalyan");
		set.add("Raja");
		set.add("Sai");
		set.add("Mahesh");
		Object obj=new Object();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			obj=itr.next();
			System.out.println(obj);
		}

	}

}
