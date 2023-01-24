package Lec02.Ass02;

public class ProjectManager extends Employee {
    private int position;
    public ProjectManager(String name, String department, int salary,int ot, int position) {
    super(name, department, salary, ot);
    this.position = position;
    }
    public int calculateSalary() {
    return salary + position;
    }
    public String display() {
    return "ชื่อ : " + name + " แผนก : " + department + " เงินเเดือน : " + salary + " OT : " + 0 + " รวม : "+calculateSalary()+" [ ค่าตำแหน่ง :]"+position; 
    }
}
