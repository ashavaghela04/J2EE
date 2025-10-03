/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_insert;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Student_insert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            //12=>inserts a record of a student by using Prepared Statement.
            Scanner sc=new Scanner(System.in);
            System.out.print("First Name=");
            String firstname=sc.nextLine();
            System.out.print("Last Name=");
            String lastname=sc.nextLine();
            System.out.print("Course=");
            String course =sc.nextLine();
            System.out.print("Semester=");
            int semester=sc.nextInt();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tyb","root","");
            String query="insert into student(firstname,lastname,course,semester) values (?,?,?,?)";
            //String query="delete from student";
            PreparedStatement st=con.prepareStatement(query);
             st.setString(1, firstname);
             st.setString(2, lastname);
             st.setString(3, course);
             st.setInt(4, semester);
             st.executeUpdate();
             String table="select *from student";//desplay all data
             
             ResultSet r_s=st.executeQuery(table);
             System.out.println("\tRollno\t\tfirstname\t\tLastname\t\tCourses\t\tSemester\n");
             while(r_s.next())
             {
                 System.out.print("\t" +r_s.getInt(1));
                  System.out.print("\t\t" +r_s.getString(2));
                 System.out.print("\t\t" +r_s.getString(3));
                 System.out.print("\t\t" +r_s.getString(4));
                 System.out.print("\t\t" +r_s.getInt(5));
                 System.out.println("");
             }
             
             
        }
        catch(Exception e)
        {
            System.out.println("Sorry"+e);
        }
    }
    
}
