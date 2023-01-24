package Lec01.Leb01;

public class Person {
    public String name;
	public int age;
	public String gender;
	
	public Person() {
		gender = "ไม่ระบุเพศ";
		name = "";
		age = 0;
	}
	
	public Person(String name) {
		gender = "ไม่ระบุเพศ";
		this.name = name;
		age = 0;
	}
	
	public Person(String name,int age) {
		gender = "ไม่ระบุเพศ";
		this.name = name;
		this.age = age;
	}
	
	public Person(String name,int age,String gender) {
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	
	public int calcualteBirthYear() {
		return 2565 - age;
	}
	
	public String Display() {
		return name + " เพศ "+ gender + " ปีเกิด " + calcualteBirthYear();
	}
}
