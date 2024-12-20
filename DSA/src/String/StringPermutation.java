package String;

public class StringPermutation {
public static void main(String[] args) {
permuteString("", "ABC");	
}
public static void permuteString(String perm,String input) {
	
	if(input.length()==0) {
		System.out.println(perm);return;}
	for(int i=0;i<input.length();i++) {
		permuteString(perm+input.charAt(i), input.substring(0,i)+input.substring(i+1,input.length()));
	}	
	
	
}
}
