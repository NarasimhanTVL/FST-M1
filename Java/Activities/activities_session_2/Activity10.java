package activities_session_2;

import java.util.ArrayList;
import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> mySet=new HashSet<String>();
		mySet.add("TVL");
		mySet.add("nara");
		mySet.add("Ren");
		mySet.add("Sri");
		mySet.add("Nara");
		mySet.add("Ren");
		mySet.add("Tiger");
		System.out.println("Print all the added names: ");
		for(String name:mySet)
		{
			System.out.println(name);
		}
		mySet.remove("Tiger");
		System.out.println("List after removing 3rd item is: ");
		for(String name:mySet)
		{
			System.out.println(name);
		}
		System.out.println("Contains Good boy name or not :"+mySet.contains("Good boy"));
	}

}
