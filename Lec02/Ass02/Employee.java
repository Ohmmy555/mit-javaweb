package Lec02.Ass02;

public class Employee {
    protected String name;
    protected String department;
    protected int salary;
    protected int ot;
    public Employee(String name, String department, int salary, int ot) {
    super();
    this.name = name;
    this.department = department;
    this.salary = salary;
    this.ot = ot;
    }
    public String getName() {
    return name;
    }
    public void setName(String name) {
    this.name = name;
    }
    public String getDepartment() {
    return department;
    }
    public void setDepartment(String department) {
    this.department = department;
    }
    public int getSalary() {
    return salary;
    }
    public void setSalary(int salary) {
    this.salary = salary;
    }
    public int getOt() {
    return ot;
    }
    public void setOt(int ot) {
    this.ot = ot;
    }
    public int calculateSalary() {
    return salary + ot;
    }
    public String display() {
    return "ชื่อ : " + name + " แผนก : " + department + " เงินเเดือน : " + salary + " OT : " + ot + " รวม : "+calculateSalary(); 
    }
    }
