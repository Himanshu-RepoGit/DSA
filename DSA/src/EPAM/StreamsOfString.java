package EPAM;

import java.util.Set;
import java.util.stream.Collectors;

public class StreamsOfString {

	
	public static void removeAllVowels() {
		String s="what is my name";
		Set<Character> sset=Set.of('a','e','i','o','u');
		String editedString=s.chars().mapToObj(i-> (char)i).filter(j-> !sset.contains(j)).map(String::valueOf).collect(Collectors.joining());
		System.out.println(editedString);
	}
	
	public static void printAllCharactersOccuringMoreThnaOnce() {
		String s="what is my name";
		String editedString=s.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1).map(i->i.getKey()).map(String::valueOf).collect(Collectors.joining());
		System.out.println(editedString);
	}
	public static void main(String[] args) {
		//removeAllVowels();
		printAllCharactersOccuringMoreThnaOnce();
	}
}
