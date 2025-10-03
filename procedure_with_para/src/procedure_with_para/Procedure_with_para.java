/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procedure_with_para;

import java.sql.*;

/**
 *
 * @author HP
 */
public class Procedure_with_para {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            //16=>inserts a record of an employee using a callable statement. (Procedure with Parameter)
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tyb","root","");
            
            String query="{call insert_emp_para(?,?,?,?,?)}";//name of procedure
            CallableStatement cst=con.prepareCall(query);
            
           
            cst.setString(1,"himali");
            cst.setString(2,"manager");
            cst.setString(3,"surat");
            cst.setInt(4,50000);
            cst.setString(5,"account");
            cst.execute();
            String table="select *from employee";
             PreparedStatement st=con.prepareStatement(table);
             ResultSet r_s=cst.executeQuery(table);
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
