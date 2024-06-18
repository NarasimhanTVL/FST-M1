package activities_session_2;

import java.util.Arrays;

import javax.print.attribute.standard.NumberUpSupported;

public class Activities4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {6,10,3,99,1,5};
		//System.out.println("Numbers given before sorting are : " + numbers[i]);
		  System.out.println("Numbers given before sorting are : " + Arrays.toString(numbers));
		
		for(int i=0;i<numbers.length;i++) {
		ascendingSort(numbers);
		}
		System.out.println("Sorted Array in Ascending Order: ");
		System.out.println(Arrays.toString(numbers));
	}
	
	static void ascendingSort(int array[]) {
		int size=array.length, i;
		for (i=1;i<size;i++) {
			int key=array[i];
			//System.out.println("value of i is " + i);
			int j=i-1;
			//System.out.println("value of j is " + j);
			while(j>=0 && key<array[j]) {
				array[j+1]=array[j];
				--j;
			}
			array[j+1]=key;
			//System.out.println("j+1 is " + array[j+1]);
		}
	}
}
