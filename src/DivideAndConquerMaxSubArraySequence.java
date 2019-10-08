
public class DivideAndConquerMaxSubArraySequence {

	public static void main(String[] args) {
		 int arr[] = {2, 3, 4, 5, 7}; 
		System.out.println(maxSubArraySum(0,4, arr));
	}

	public static int maxSubArrayCrossingMid(int[] arr,int l, int m,int h){
		int left_sum = Integer.MIN_VALUE;
		int right_sum = Integer.MIN_VALUE;
		int sum = 0;
		for(int i =m;i>=l;i--){
			sum =sum + arr[i];
			if (sum>left_sum){
				left_sum =sum;
			}
		}
		sum =0;
		for(int i = m+1;i<=h;i++){
			sum = sum + arr[i];
			if (sum>right_sum)
				right_sum =sum;
		}
		
		return left_sum + right_sum;
	}
	
	/**
	 * Time complexity is O(nlogn) . It follows the Divide and Conquer algorithm.
	 *  Link to follow is https://www.geeksforgeeks.org/maximum-subarray-sum-using-divide-and-conquer-algorithm/
	 *  
	 * 
	 **/
	public static int maxSubArraySum(int l,int h,int arr[]){
		if (l == h)
			return arr[l];
		else {
			int m =(l+h)/2;
			return Math.max(Math.max(maxSubArraySum(l,m,arr), maxSubArraySum(m+1,h,arr)),maxSubArrayCrossingMid(arr, l, m, h));
		}
	}
}
