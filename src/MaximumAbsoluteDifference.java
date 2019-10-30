public class MaximumAbsoluteDifference {

	public static void main(String[] args) {
		 int[] array = { -70, -64, -6, -56, 64, 61, -57, 16, 48, -98 }; 
		 System.out.println(getMaximumAbsoluteDifference(array)); 
	}
	
	/**
	 * Time complexity is O(n).
	 *  Link to follow is https://www.geeksforgeeks.org/maximum-absolute-difference-value-index-sums/
	 *  
	 * 
	 **/
	public static int getMaximumAbsoluteDifference(int[] a){
		int length= a.length;
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		
		for(int i=0;i<length;i++) {
			max1=Math.max(max1, a[i]+i);
			min1=Math.min(min1, a[i]+i);
			max2=Math.max(max2, a[i]-i);
			min2=Math.min(min2, a[i]-i);
		}
		return Math.max(max1-min1, max2-min2);
	}

}
