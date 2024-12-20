package EPAM;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestClass {
public static void main(String[] args) {
secondNonRepeatedCharacter("Java is my programming language");	
	
	
}
public static void secondNonRepeatedCharacter(String s) {
	Character answer=s.chars().mapToObj(i->Character.valueOf((char)i)).
					collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).
					entrySet().stream().filter(entry->entry.getValue()==1).skip(1).findFirst().map(entry->entry.getKey()).get();
	
	System.out.println(answer);
	
}
}
