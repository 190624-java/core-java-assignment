package com.revature.java_projects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/*
 * Sort two employees based on their name, department, and age using the Comparator
interface.
 */

public class Question7 
{
	String name;
	String department;
	int age;
	
	public static void readAnswer() 
	{
		ArrayList<Question7> sl = new ArrayList<>();
		sl.add(new Question7("Jim","Finance",39));
		sl.add(new Question7("Fred","Digital Security",87));
		System.out.println("Initial ordering:");
		for(Question7 q:sl) 
		{
			System.out.println(q.toString());
			System.out.println();
		}
//		for(int i = 0; i<sl.size();i++) 
//		{
//			System.out.println(sl.get(i).toString());
//		}
		System.out.println("Sorted by Name:");
		Collections.sort(sl, new compareName());
		for(int i = 0; i<sl.size();i++) 
		{
			System.out.println(sl.get(i).toString());
			System.out.println();
		}
		System.out.println("Sorted by Department:");
		Collections.sort(sl, new compareDepartment());
		for(int i = 0; i<sl.size();i++) 
		{
			System.out.println(sl.get(i).toString());
			System.out.println();
		}
		System.out.println("Sorted by Age:");
		Collections.sort(sl, new compareAge());
		for(int i = 0; i<sl.size();i++) 
		{
			System.out.println(sl.get(i).toString());
			System.out.println();
		}
	}

	@Override
	public String toString() 
	{
		return "Name: " + name + "\nDepartment: " + department + "\nAge: " + age;
		
	}
	
	public Question7(String name, String department, int age) 
	{
		super();
		this.name = name;
		this.department = department;
		this.age = age;
	}

	public int compareTo(Question7 other) 
	{
		return this.name.compareTo(other.name);
	}

	static class compareName implements Comparator<Question7>
	{

		@Override
		public int compare(Question7 o1, Question7 o2) {
			// TODO Auto-generated method stub
			return o1.compareTo(o2);
		}
		
	}
	static class compareDepartment implements Comparator<Question7>
	{

		@Override
		public int compare(Question7 o1, Question7 o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
	static class compareAge implements Comparator<Question7>
	{

		@Override
		public int compare(Question7 o1, Question7 o2) {
			// TODO Auto-generated method stub
			return o1.age-o2.age;
		}
		
	}
}
