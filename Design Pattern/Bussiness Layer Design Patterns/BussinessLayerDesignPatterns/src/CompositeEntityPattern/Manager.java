package CompositeEntityPattern;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{
    
    private List<Employee> employeeList= new ArrayList<Employee>();


    public Manager(String name,double salary){
       super(name,salary);
    }

    public void addEmployees(Employee employee){
        employeeList.add(employee);
    }

    public Employee getEmployee(int i){
        return employeeList.get(i);
    }

    public void display(){

        System.out.println("======================");
        System.out.println("name = "+this.name);
        System.out.println("Salary = "+ this.salary);
        System.out.println("======================");
        
        for (Employee employee : employeeList) {
            employee.display();
        }
    }

    
}
