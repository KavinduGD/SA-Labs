package CompositeEntityPattern;

public class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, salary);
       
    }

    public void print(){
        System.out.println("======================");
        System.out.println("name = "+this.name);
        System.out.println("Salary = "+ this.salary);
        System.out.println("======================");
    }
    
}
