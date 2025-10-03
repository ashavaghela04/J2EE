/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_display_3;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Employee_display_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            //11=>accepts a department name from the user and displays the employee name along with their designation.
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter employe department =");
            String depar=sc.next();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tyb","root","");
            String table="SELECT empnm,designation,department FROM employee where department=?";
            PreparedStatement st=con.prepareStatement(table);
            st.setString(1, depar);
            ResultSet r_s=st.executeQuery();
            System.out.println("......Display records......");
          System.out.println("Name\t\tDesignation\t\tDepartment\n");
             while(r_s.next())
             {
                
                System.out.print(r_s.getString(1));
                System.out.print("\t\t"+r_s.getString(2));
                System.out.print("\t\t"+r_s.getString(3));
                
                 System.out.println("");
                     
             }
        }
        catch(Exception e)
        {
            System.out.println("Sorry"+e);
        }
    }
    
}
