package CompositeEntityPattern;

public class Employee {

    protected String  name;
    protected double salary;

    public Employee(String name,double salary){
        this.name=name;
        this.salary= salary;
    }
    public String getname(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    public void print(){ }

    public void addEmployee(Employee employee){}

    public void removeEmployee(Employee employee) {}

    public void getChild(int i){}

    

    
}
