package CompositeEntityPattern;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{
    
    private List<Employee> employeeList= new ArrayList<Employee>();


    public Manager(String name,double salary){
       super(name,salary);
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    // public void removeEmployee(Employee emp){
    //     for (Employee employee : employeeList) {
    //         if(employee==emp){
    //             employeeList.remove(employee);
    //         }
    //     }

    // }

    public Employee getEmployee(int i){
        return employeeList.get(i);
    }

    public void print(){

        System.out.println("======================");
        System.out.println("name = "+this.name);
        System.out.println("Salary = "+ this.salary);
        System.out.println("======================");
        
       for(int i=0;i<employeeList.size();i++){
           Employee employee= employeeList.get(i);
           employee.print();
       }
    }

    
}
