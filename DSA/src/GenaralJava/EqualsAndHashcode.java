package GenaralJava;

import java.util.Objects;

import DummyClass.Person1;

public class EqualsAndHashcode{
	public static void main(String[] args) {
		
	}
}

 class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

 @Override   
 public boolean equals(Object o) {
	 if(this==o)return true;
	 if(o==null || getClass()!=o.getClass()) return false;
	 Person p=(Person)o;
	 return age==p.age && Objects.equals(p.name,name);
 }   
 public int hasCode() {
	 return Objects.hash(name,age);
 }
    
}