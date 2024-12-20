package DummyClass;

import java.util.ArrayList;
import java.util.List;

public class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

public static List<Person1> getListOfPerson() {
	 Person1 p1=new Person1("Himanshu", 20);
	 Person1 p2=new Person1("Surya", 10);
	 Person1 p3=new Person1("Vivek", 90);
	 List<Person1> li = new ArrayList<Person1>();
	 li.add(p1);
	 li.add(p2);
	 li.add(p3);
	 return li;
 } 


public static List<List<Person1>> getListOfListOfPerson() {
	List<List<Person1>> result=new ArrayList<List<Person1>>();
	 Person1 p1=new Person1("Himanshu", 20);
	 Person1 p2=new Person1("Surya", 10);
	 Person1 p3=new Person1("Vivek", 90);
	 List<Person1> li = new ArrayList<Person1>();
	 li.add(p1);
	 li.add(p2);
	 List<Person1> l2 = new ArrayList<Person1>();
	 l2.add(p3);
	 result.add(li);result.add(l2);
	 return result;
 }  
    
}  