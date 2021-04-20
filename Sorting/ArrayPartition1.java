
public class ArrayPartition1 {

	public static void main(String[] args) {
		int[] nums = {1,4,3,2};
		int answer = arrayPairSum(nums);
		System.out.println(answer);

	}
	
	public static int arrayPairSum(int[] nums) {
		//Based on the array to be sorted because we are finding min(a1,b1)
		int sum = 0;
		for(int i = 0; i < nums.length -1; i+=2) {
			sum += nums[i];
		}
		return sum;
	}

}
