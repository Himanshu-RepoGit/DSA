import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestEPAM {
	   public static void main(String[] args) {
	        int[] arr = {-9,0,3,5,9,12}; // -> sorted array
	        int input = -9; 
	        int ans=-1;
	        int end=arr.length;
	        int beg=0;

			while (beg <= end) {
				int midIndex = (beg + end) / 2;
				if (arr[midIndex] == input) {
					ans = midIndex;
					break;
				}
				if (arr[midIndex] < input) {
					beg = midIndex + 1;
				} else {
					end = midIndex - 1;
				}
			}
	        System.err.println("Answer is "+ans);
	        
	    }
}
