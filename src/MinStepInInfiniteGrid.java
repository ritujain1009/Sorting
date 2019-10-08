import java.util.Arrays;
import java.util.List;

public class MinStepInInfiniteGrid {

	public static void main(String[] args) {
		List<Integer> xpoints = Arrays.asList(0,1,1);
		List<Integer> ypoints = Arrays.asList(0,1,2);
		System.out.println(minStepsInInfiniteGrid(xpoints,ypoints));
	}
	
	/**
	 * Time complexity is O(n) . 
	 *  Link to follow is https://www.geeksforgeeks.org/minimum-steps-needed-to-cover-a-sequence-of-points-on-an-infinite-grid/
	 * 
	 **/
	public static int minStepsInInfiniteGrid(List<Integer> xpoints,List<Integer> ypoints){
		int distance=0;
		int xdistance =0;
		int ydistance = 0;
		int size = xpoints.size();
		for ( int i=1;i<size;i++){
			xdistance = Math.abs(xpoints.get(i)-xpoints.get(i-1));
			ydistance = Math.abs(ypoints.get(i)-ypoints.get(i-1));
			distance +=Math.max(xdistance, ydistance);
		}
		return distance;
	}

}
