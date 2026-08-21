package lab13;

public class Test {

    public static void main(String[] args) {

  
        Manager manager = new Manager("Alice Johnson", "Operations Manager");

   
        Employee emp1 = new Employee("Bob Smith", "Clerk");
        Employee emp2 = new Employee("Carol Davis", "Receptionist");
        manager.addEmployee(emp1);
        manager.addEmployee(emp2);

  
        SkilledWorker worker = new SkilledWorker("Dave Wilson", "Technician");
        worker.addSkill("Welding");
        worker.addSkill("Electrical Wiring");
        worker.addSkill("Forklift Operation");
        manager.addEmployee(worker);

      
        System.out.println(manager.getInfo());
        
    }
}