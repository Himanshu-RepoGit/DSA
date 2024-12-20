package GenaralJava;

import java.util.Comparator;

import DummyClass.Person1;

public class ComparableClass implements Comparable<ComparableClass> {

	int age;
	int name;

	@Override
	public int compareTo(ComparableClass o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.age, o.age);
	}

}
class PersonAgeComparator implements Comparator<Person1>{

	@Override
	public int compare(Person1 p1, Person1 p2) {
		// TODO Auto-generated method stub
		  return Integer.compare(p1.getAge(), p2.getAge());
	}
	
}
