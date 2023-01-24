package Lec02.Ass02;

public class Programmer extends Employee {
    private int skill;
    public Programmer(String name, String department, int salary, int ot, int skill) {
    super(name, department, salary, ot);
    this.skill = skill;
    }
    public int calculateSalary() {
    return super.calculateSalary() + skill;
    }
    public String display() {
    return "ชื่อ : " + name + " แผนก : " + department + " เงินเเดือน : " + salary + " OT : " + ot + " รวม : "+calculateSalary()+" [ ค่าทักษะ :]"+skill; 
    }
}
