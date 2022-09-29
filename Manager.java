package Membeproject3;
//manager class is inherited using extend keyword from member
public class Manager extends Member {
//declaring data members of manager
 private String name;
 private int age;
 private String phoneno;
 private String address;
 private int salary;
 private String department;
 
 //default constructor is called
 public Manager() {
		super();
	}
 
 //parameterized constructor is called
 public Manager(String name, int age, String phoneno, String address, int salary, String department) {
		super();
		this.name = name;
		this.age = age;
		this.phoneno = phoneno;
		this.address = address;
		this.salary = salary;
		this.department = department;
	}

 //getter & setter methods are decalred
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

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public void displayinfo() //to display info about manager
{
	 System.out.println("Name of Manager:"+name);
	 System.out.println("Age of Manager:"+age);
	 System.out.println("Phone no of Manager:"+phoneno);
	 System.out.println("Address of Manager:"+address);
	 System.out.println("Salary of Manager:"+salary);
	 System.out.println("Department of manager:"+department);
}
 }


