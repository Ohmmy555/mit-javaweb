package Lec02.Leb02;

public class Person {
    protected String fullname;
	protected int age;
	protected String gender;
	
	
	public Person() {
		fullname = "ยังไม่ลงชื่อ";
		age = 0;
		gender = "ไม่ระบุเพศ";
	}
	
	public Person(String fullname,int age,String gender) {
		this.fullname = fullname;
		this.age = age;
		this.gender = gender;
	}
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setYaer(int age) {
		if(age<=0) {
			System.out.println("กรุณากรอกอายุให้ถูกต้อง");
			System.exit(0);
		}else {
			this.age = age;
		}
		
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int calculateAge() {
	return 2565 - age;
	}
	
	public String display() {
		return fullname + " เพศ : " + gender + " ปีเกิด : "+ calculateAge() ;
	}
}
