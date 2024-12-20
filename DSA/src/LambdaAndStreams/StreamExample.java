package LambdaAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import DummyClass.Employee;
import DummyClass.Item;
import DummyClass.Person1;

public class StreamExample {
public void map() {
	List<Person1> pStream=Person1.getListOfPerson();
	List<Integer> li=pStream.stream().map(i ->i.getAge()).collect(Collectors.toList());
}
public void flatmap() {
	List<List<Person1>> pStream=Person1.getListOfListOfPerson();
	List<Person1> li=pStream.stream().flatMap(List ::stream).collect(Collectors.toList());
}

public void maxMin() {
	List<Integer> li = new ArrayList<Integer>();

}
public void groupByWithSummingInt(){
	List<Item> li = new ArrayList<>();
	Map<String,Integer> hm=li.stream().collect(Collectors.groupingBy(Item::getName,Collectors.summingInt(Item::getQty)));
}

public void groupByAgeAndList(){
	List<Employee> li = new ArrayList<>();
	Map<String,List<Employee>> hm=li.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.mapping(Function.identity(), Collectors.toList())));
	Map<String,List<Employee>> hm2=li.stream().collect(Collectors.groupingBy(Employee::getName));
}

}
