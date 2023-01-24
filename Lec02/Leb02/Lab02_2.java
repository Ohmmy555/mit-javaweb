package Lec02.Leb02;

public class Lab02_2 {
    Student human2 = new Student();
//		human2.setFullname("Supphitan");
//		human2.setGender("ชาย");
//		human2.setYaer(21);
//		human2.setStudentID("633020334-8");
		System.out.println(human2.display());
		
		
		Student human1 = new Student("Supphitan",-21,"ชาย","633020334-8");
		System.out.println(human1.display());
}
