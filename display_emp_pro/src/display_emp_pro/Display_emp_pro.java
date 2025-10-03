/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package display_emp_pro;

import java.sql.*;

/**
 *
 * @author HP
 */
public class Display_emp_pro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            //18=>displays all the records of employees whose designation is provided by the user using a callable statement.
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tyb","root","");
            
            String query="{call display_emp(?)}";//name of procedure
            CallableStatement cst=con.prepareCall(query);
            cst.setString(1,"manager");
            
             ResultSet r_s=cst.executeQuery();
           System.out.println("\tId\tName\tDesignation\tCity\tSalry\tDepartment\n");
             while(r_s.next())
             {
                System.out.print("\t"+r_s.getInt(1));
                System.out.print("\t"+r_s.getString(2));
                System.out.print("\t"+r_s.getString(3));
                System.out.print("\t"+r_s.getString(4));
                System.out.print("\t"+r_s.getInt(5));
                System.out.print("\t"+r_s.getString(6));
                 System.out.println("");
                     
             }   
             
            
        }
        catch(Exception e)
        {
           System.out.println("Sorry"+e);
        }
        
    }
    
}
