import java.util.*;
import java.sql.*;
public class InsertDemo{
	public static void main (String[] args){
		Scanner sc=new Scanner (System.in);
	    System.out.printf("roll no:");
		int rollNo=Integer.parseInt(sc.nextLine());
		System.out.print("full name:");
        String name=sc.nextLine();
		System.out.print("Address:");
		String address =sc.nextLine();
		System.out.print("Gender:");
		String gender=sc.nextLine();
		System.out.print("course:");
		String course =sc.nextLine();				
		Connection cn=DatabaseConnection.getConnection();	
		try{
			Statement neha=cn.createStatement();
			String sql ="Insert into student(roll_num,name,address,gender,course)values("+rollno+",'"+name+"','"+address+"','"+gender+"','"+course+"')";
			neha.executeUpdate(sql);
			System.out.println("Inserted!");
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
		
			
			
			
			
			
			
			
							