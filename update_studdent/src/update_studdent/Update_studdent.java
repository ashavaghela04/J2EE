/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package update_studdent;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Update_studdent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            // 13=>updates a record of a student by using Prepared Statemen
            Scanner sc=new Scanner(System.in);
            System.out.print("First Name=");
            String firstname=sc.nextLine();
            System.out.print("Last Name=");
            String lastname=sc.nextLine();
            System.out.print("Course=");
            String course =sc.nextLine();
            System.out.print("Semester=");
            int semester=sc.nextInt();
            System.out.print("Enter RollNo where you change data=");
            int rollno=sc.nextInt();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tyb","root","");
            String query="update student set firstname=?,lastname=?,course=?,semester=? where rollno=?";
            //String query="delete from student";
            PreparedStatement st=con.prepareStatement(query);
             st.setString(1, firstname);
             st.setString(2, lastname);
             st.setString(3, course);
             st.setInt(4, semester);
             st.setInt(5, rollno);
             st.executeUpdate();
             String table="select *from student";//desplay all data
             
             ResultSet r_s=st.executeQuery(table);
             System.out.println("\tRollno\t\tfirstname\t\tLastname\t\tCourses\t\tSemester\n");
             while(r_s.next())
             {
                 System.out.print("\t\t" +r_s.getInt(1));
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
