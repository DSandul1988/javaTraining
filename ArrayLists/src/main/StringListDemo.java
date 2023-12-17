package main;

import java.util.ArrayList;

public class StringListDemo {
public static void main(String[] args) {
	
	ArrayList<String> list = new ArrayList<String>();
	
	list.add(0, "dan");
	list.add(1, "vasea");
	list.set(1, "dan");
	System.out.println(list);
	for (String s : list) {
		System.out.println(s.toUpperCase());
	}
	list.forEach(s-> System.out.println(s.toLowerCase()));
}
}
