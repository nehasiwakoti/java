import java.sql.Connection;
import java.sql.DriverManager;
public  class DatabaseConnection{
         Connection cn=null;
   String url=null;
   String driverClass=null;
   try{
   url="jdc:mysql://localhost:3306/csit_third";
   driverClass="com.mysql.jbdc.Driver";
     Class.forName(driverClass);//loading the driver
	 cn=DriverManager.getConnection(url,"usernmae","password");
	 System.out.println("Connected!!");
   }catch(Exception e){
   System.out.ptintln(ex.getMessage());
     
   }
   return cn;
  }
  public static void main(String []args){
     Connection cn=DatabaseConnection.getConnection();
	 }
	 }
	 