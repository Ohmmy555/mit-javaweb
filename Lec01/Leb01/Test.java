package Lec01.Leb01;

public class Test {
    Person human = new Person();
		human.name = "สมศักดิ์";
		human.age = 45;
		human.gender = "ชาย";
		System.out.println(human.Display());
		
		Person human2 = new Person("จอมขวัญ",30);
		System.out.println(human2.Display());
}
