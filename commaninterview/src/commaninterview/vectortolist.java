package commaninterview;

import java.util.*;


public class vectortolist {
	public static void main(String[] args) {
		Vector<String>vec=new Vector<String>();
		vec.add("1");
		vec.add("2");
		vec.add("3");
		vec.add("4");
		vec.add("5");
		vec.add("6");
		vec.add("7");
		vec.add("8");
		vec.add("9");
		vec.add("10");
		System.out.println("vector"+vec);
		List<String>list=Collections.list(null)(vec.elementAt(0));
		System.out.println("List"+list);
		
	}

	}


