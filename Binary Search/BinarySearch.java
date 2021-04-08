
public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = {-1,0,3,5,9,12};
		int result = search2(nums,9);
		System.out.println(result);
	}
	
	public static int search(int[] nums, int target) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public static int search2(int[] nums, int target) {
		int low = 0; 
		int high = nums.length -1;
		
		while(low <= high) {
			int mid = (low + high)/2;
			if(nums[mid] == target) {
				return mid;
			}
			if(target > nums[mid]) { // basically, the target is on the right side so, it's bigger than the mid number
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return -1;
	}
}
