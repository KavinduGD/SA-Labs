package CompositeEntityPattern;

public class Test {

    public static void main(String[] args) {

        Employee developer1= new Developer("john",10000);
        Employee developer2= new Developer("david", 15000);
        Employee  manager1= new Manager("Daniel", 25000);
        manager1.addEmployee(developer1);
        manager1.addEmployee(developer2);

        Employee developer3= new Developer("Michael",20000);
        
        Employee generalManager = new Manager("Mark", 500000);
        generalManager.addEmployee(developer3);
        generalManager.addEmployee(manager1);

        generalManager.print();

        

       

        
        

    }
    
}
