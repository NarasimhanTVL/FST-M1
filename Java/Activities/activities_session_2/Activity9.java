package activities_session_2;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList=new ArrayList<String>();
		myList.add("TVL");
		myList.add("nara");
		myList.add("Ren");
		myList.add("Sri");
		myList.add("Nara");
		myList.add("Ren");
		myList.add(2,"Tiger");
		System.out.println("Print all the added names: ");
		for(String name:myList)
		{
			System.out.println(name);
		}
		System.out.println("3rd name is "+myList.get(3));
		System.out.println("Contains or not "+myList.contains("Naara"));
		System.out.println("Number of names in the list is "+myList.size());
		System.out.println("Removing 3rd name from the list  "+myList.remove(3));
		for(String name:myList)
		{
			System.out.println(name);
		}
		System.out.println("Number of names in the list after removal is "+myList.size());
	}

}
