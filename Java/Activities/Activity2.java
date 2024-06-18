package activities_session_2;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr={10,77,10,54,-11,10};
		int searchNum=10;
		int fixedSum=30;
		System.out.println("Result is "+result(numArr,searchNum,fixedSum));
	}
	public static boolean result(int[] numbers,int searchNum,int fixedSum) {
		int temp_sum=0;
		for(int nums : numbers) {
			if(nums == searchNum) {
				temp_sum=temp_sum+searchNum;				
			}
			if(temp_sum>fixedSum) {
				break;
			}
				
			}
		//return true;
		System.out.println(temp_sum);
		return temp_sum==fixedSum;
		}
}
