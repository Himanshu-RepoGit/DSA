package GenaralJava;

import java.util.Arrays;

public class ZeroOnes {
public static void main(String[] args) {
	setZeroToLeftAnd1ToRight(new int[] {1,0,0,1,0,1,0,1});
}
public static void setZeroToLeftAnd1ToRight(int arr[]) {
	int left=0;
	int right=arr.length-1;
	while(left<right) {
		while(arr[left]==0 && left<right) {
			left++;
		}
		while(arr[right]==1 && left<right) {
			right--;
		}
		if(left<right) {
			arr[left]=0;
			arr[right]=1;
			left++;
			right--;
		}
	}
	System.out.println(arr);
	Arrays.stream(arr).forEach(System.out::println);
}
}
