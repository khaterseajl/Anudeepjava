package Membeproject3;
 //employee class is get inherited by Member class
public class Employee1 extends Member{
//decalring data membbers of employee
	 private String name;
	 private int age;
	 private String phoneno;
	 private String address;
	 private int salary;
     private String specailization;

   //default const is called..
 public Employee1() {
		super();
	}

 //parameterized const is called..
public Employee1(String name, int age, String phoneno, String address, int salary, String specailization) {
	super();
	this.name = name;
	this.age = age;
	this.phoneno = phoneno;
	this.address = address;
	this.salary = salary;
	this.specailization = specailization;
}

//generated getter &setter methods
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

public String getPhoneno() {
	return phoneno;
}

public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public String getSpecailization() {
	return specailization;
}

public void setSpecailization(String specailization) {
	this.specailization = specailization;
}

public void Printinfo()//printing info of employee
{
	 System.out.println("Name of employee:"+name);
	 System.out.println("Age of employee:"+age);
	 System.out.println("Phone no of employee:"+phoneno);
	 System.out.println("Address of employee:"+address);
	 System.out.println("Salary of employee:"+salary);
	 System.out.println("Specialization of employee:"+specailization);
	 
}



}
