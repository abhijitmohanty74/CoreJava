class Employee{
    int salary;
    Employee(){
        this.salary = salary;
    }
    void show(){
        System.out.println("Monthly salary");
    }
    void work(){
        System.out.println("Working as an Employee");
//        return salary;
    }
}
class Manager extends Employee{
    
}
public class Inheritance9 {
    public static void main(String[] args) {
        Employee em = new Employee();
        em.show();
        em.work();
    }
}
