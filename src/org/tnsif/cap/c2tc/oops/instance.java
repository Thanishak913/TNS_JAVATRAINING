package org.tnsif.capgemini.c2tc.oop;

class Person5
{
	
}
class Employee extends Person5
{
	
}

class Manager extends Employee
{
	
}
public class Instance {

	public static void main(String[] args) {
		Person5 person =new Person5();
		Employee employee =new Employee();
		 Manager manager =new  Manager();
		 System.out.println(employee instance Employee); // T
		 System.out.println(employee instanceof Person5);  //T
		 System.out.println(employee instanceof Manager); //F
		 System.out.println(manager instanceof Manager); //T
		 System.out.println(manager instanceof Employee);  //T
		 System.out.println(manager instanceof Person5); //T
		 System.out.println(person instanceof Employee); //F
		 System.out.println(person instanceof 	Manager); //F
		 
		 
		 
	}

}
