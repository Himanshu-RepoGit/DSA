package EPAM;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TesMgr {
	/* Sample Input = [1,2,3,4,5,1,2] 
	 * output = [(1,3),(2,2)], [(1,4),(2,3)], [(1,5),(2,4)], [(2,5),(3,4)] 
	 * 
	 * Sample Input = [1,2,3,4,5,6,1,2] 
	 * output = [(1,3),(2,2)], [(1,4),(2,3)], [(1,5),(2,4)], [(2,5),(3,4),(1,6)], [(2,6),(3,5)], [(3,6),(4,5)] */
	
	
	//1,1,2,2,3,4,5,6
	
	/**
	 *  1-2
	 *  2-2
	 *  3-1
	 *  4-1
	 *  5-1
	 *  6-1
	 * 
	 * 
	 * @param args
	 */
	
public static void main(String[] args) {
	
}	

public void printEqualPair(int arr[]) {
	Arrays.sort(arr);
	int sum=Arrays.stream(arr).sum();
	Map<Integer,Integer> frequency=new HashMap<>();
	for(int i:arr)
		frequency.put(i, frequency.getOrDefault(i, 0)+1);
	for(int i=1;i<=sum/2;i++) {
	findPairs(i,arr);
	
	}
	}
	
}
	
}
