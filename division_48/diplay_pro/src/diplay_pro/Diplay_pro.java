/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diplay_pro;
import java.sql.*;
/**
 *
 * @author HP
 */
public class Diplay_pro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            //17=>displays employee’s designation by providing empno using callable statement.
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tyb","root","");
            
            String query="{call display_emp_no(?)}";//name of procedure
            CallableStatement cst=con.prepareCall(query);
            cst.setInt(1,10);
            
             ResultSet r_s=cst.executeQuery();
            System.out.println("\tDesignation\n");
             while(r_s.next())
             {
                
                System.out.print("\t"+r_s.getString(1));
              
                 System.out.println("");
                     
             }
            
        }
        catch(Exception e)
        {
           System.out.println("Sorry"+e);
        }
    }
    
}
