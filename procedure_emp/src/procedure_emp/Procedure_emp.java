/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procedure_emp;

import java.sql.*;

/**
 *
 * @author HP
 */
public class Procedure_emp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            //15=> inserts a default record of an employee using a callable statement(Procedure without parameter)
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tyb","root","");
            
            String query="{call insert_emp()}";//name of procedure
            //...procedure data....insert into employee (empnm,designation,city,salary,department) values('yashvi','HR-manager','rajula',60000,'account')
            CallableStatement cst=con.prepareCall(query);
            
        }
        catch(Exception e)
        {
           System.out.println("Sorry"+e);
        }
    }
    
}
