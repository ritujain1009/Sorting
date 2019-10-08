import java.util.Arrays;
import java.util.List;

public class KadaneMaxSubArraySequence {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList( -2, -3, 4, -1, -2, 1, 5, -3);
		System.out.println(maxSubArraySequence(list));
	}
	
	public static void printMaxSubArray(int start,int end,List<Integer>list){
		for (int i=start;i<=end;i++){
			System.out.print(list.get(i));
			System.out.print("\t");
		}
		System.out.println();
	}
	
	/**
	 * Time complexity is O(n) . It follows the Kadane's algorithm.
	 *  Link to follow is https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
	 *  Explaination video : https://www.youtube.com/watch?v=86CQq3pKSUw
	 *  
	 * 
	 **/
	public static int maxSubArraySequence(List<Integer> list){
		int max_so_far = Integer.MIN_VALUE;
		int s = 0, start = 0, end =0;
		int max_ending_here = 0;
		for( int i =0 ;i<list.size();i++){
			max_ending_here += list.get(i);
			if (max_so_far <max_ending_here){
				start = s;
				end =i;
				max_so_far = max_ending_here;
			}
			if (max_ending_here<0){
				max_ending_here =0;
				s=s+1;
			}
		}
		printMaxSubArray(start,end,list);
		return max_so_far;
	}

}
