package com.ds;

public class MainPerson {
	public static void main(String[]args) {
		// Create an array of Person objects
	    Person[] people = new Person[3];

	   
	    people[0] = new Person("Alice", 25);
	    people[1] = new Person("Bob", 30);
	    people[2] = new Person("Charlie", 22);

	    // Access and use the objects in the array
	    for (Person person : people) {
	        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
	    }
	}
}

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters (optional)
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
}
