/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employee_pack;

/**
 *
 * @author KSC55
 */
public class EmployeeBean {
     private String name;
    private String designation;
    private double salary;

    public String getName() 
    { 
        return name; 
    }
    public void setName(String name) 
    { 
        this.name = name; 
    }

    public String getDesignation() 
    { 
        return designation; 
    }
    public void setDesignation(String designation) 
    { 
        this.designation = designation; 
    }

    public double getSalary() 
    { 
        return salary; 
    }
    public void setSalary(double salary) 
    { 
        this.salary = salary; 
    }
    
}
