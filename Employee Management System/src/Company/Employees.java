/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Company;
import java.util.ArrayList;
/**
 *
 * @author srikr
 */
public class Employees {
    private ArrayList<Employee> employees;
    
    public Employees(){
        employees = new ArrayList<Employee>();
    }
    
    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    
    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    
    public Employee addEmployee(){
        Employee es = new Employee();
        employees.add(es);
        return es;
    }
    
    public void deleteEmployee(Employee e){
        employees.remove(e);
    }
}
