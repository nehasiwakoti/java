 import java.util.Scanner; 
  public class Calculator{
      public static void main (String [] args){
	  Scanner sc=new Scanner (System.in);
	  System.out.println("welcome to our calculator");
	  System.out.println("\n");
	  System.out.println("Enter first number");
	  int a = Integer.parseInt(sc.nextLine());
	  System.out.println("Enter second number");
	  int b = Integer.parseInt(sc.nextLine());
	  
	  System.out.println("your two numbers are");
	  System.out.println(a +" and "+ b);
	  }
	  }