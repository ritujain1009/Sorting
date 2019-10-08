import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddOnetoANumber {

	public static void main(String[] args) {
		List<Integer> number = new ArrayList<>();
		number.add(0);
		number.add(9);
		number.add(9);
		System.out.println(addOneToANumber(number));

	}
	
	public static List<Integer> addOneToANumber(List<Integer> number){
		int size = number.size();
		int remaining =1;
		int i = size-1;
		for ( ;i>=0;i--){
			int num = number.get(i);
			if (num + remaining>=10) {
				number.set(i,0);
				remaining = 1;
			}
			else {
				number.set(i,num+1);
				remaining = 0;
			}
			if (remaining<=0)
				break;
		}
		if (i <0) {
            number.add(0,1);
        }
		Iterator<Integer> e = number.iterator();
		int s= 0;
		while(e.hasNext() && e.next()==0) {
			s++;
		}
		number.subList(0,s).clear();
		return number;
	}

}
