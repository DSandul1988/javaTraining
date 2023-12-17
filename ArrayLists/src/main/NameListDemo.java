package main;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import lib.Name;
import lib.Name;
public class NameListDemo {
public static void main(String[] args) {
	
	List<Name> register = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	register.add(new Name("Dan","Sandul"));
	
	//boolean exists = register.stream().anyMatch(nm -> 
	//nm.getFamilyName().equals(""));
	
	 boolean ex =register.stream().anyMatch(s->s.getFirstName().toLowerCase().contains("dan"));
	System.out.println(ex);
	for (int i=0;i<4;i++) {
		System.out.println("Please enter the name");
		String fname =sc.nextLine();
		System.out.println("Please enter the surnamename");
		String lname =sc.nextLine();
		
		register.add(new Name (fname,lname));
			
	}
	register.forEach(s->System.out.println(s.getFullName()));
	sc.close();
	
	 register.stream().filter(s->s.getFirstName().length()<=4).forEach(s->System.out.println(s.getFullName()));
}
}
