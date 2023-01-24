package Lec02.Ass02;

public class ProgrammerTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Programmer obj1 = new Programmer("Supphitan", "IT", 35000, 0, 2000);
        System.out.println(obj1.display());

        ProjectManager obj2 = new ProjectManager("Supphitan", "IT", 50000, 50000, 5000);
        System.out.println(obj2.display());
    }
}
