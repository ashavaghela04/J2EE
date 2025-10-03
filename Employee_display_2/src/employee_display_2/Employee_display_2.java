/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_display_2;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Employee_display_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try
        {
            //10=>accepts empno from the user and displays the corresponding employee record.
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter employe no =");
            int empno=sc.nextInt();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tyb","root","");
            String table="SELECT *FROM employee where empno=?";
            PreparedStatement st=con.prepareStatement(table);
            st.setInt(1, empno);
            ResultSet r_s=st.executeQuery();
            System.out.println("......Display records......");
          System.out.println("Id\t\tName\t\tDesignation\t\tCity\t\tSalry\t\tDepartment\n");
             while(r_s.next())
             {
                System.out.print(r_s.getInt(1));
                System.out.print("\t\t"+r_s.getString(2));
                System.out.print("\t\t"+r_s.getString(3));
                System.out.print("\t\t"+r_s.getString(4));
                System.out.print("\t\t"+r_s.getInt(5));
                System.out.print("\t\t"+r_s.getString(6));
                 System.out.println("");
                     
             }
        }
        catch(Exception e)
        {
            System.out.println("Sorry"+e);
        }
    }
    
}
