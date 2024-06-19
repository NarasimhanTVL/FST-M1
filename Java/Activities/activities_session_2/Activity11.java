package activities_session_2;

import java.util.HashMap;
import java.util.HashSet;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> myMap=new HashMap<Integer,String>();
		myMap.put(1, "Orange");
		myMap.put(2, "Orange");
		myMap.put(3, "Orange");
		myMap.put(4, "Orange");
		myMap.put(5, "Orange");
		System.out.println("Initial size is "+myMap.size());
		System.out.println("Print all fruit names which are: "+myMap);
		myMap.remove(2);
		System.out.println("Print all fruit names after remove which are: "+myMap);
		System.out.println("Contains NARA or not in the list and the answer is "+myMap.containsValue("Nara"));
		System.out.println("Latest size is "+myMap.size());
	}
	

}
