
public class PeakIndex {

	public static void main(String[] args) {
		int[] arr = {0,1,0};
		int answer = mountainArray(arr);
		System.out.println(answer);

	}

	public static int mountainArray(int[] a) {
		int i = 0;
		while(a[i] < a[i+1]) {
			i++;
		}
		return i;
	}
}
