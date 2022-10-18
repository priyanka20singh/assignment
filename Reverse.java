package test;
import java.util.Scanner;

public class Reverse {
	  public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
	   
	    System.out.println("Enter your name");
	    String name=s.nextLine();
	    String rev="";
	    
	    
	    for(int i=0; i<name.length(); i++)
	    {
	   rev= name.charAt(i) + rev;
	    }
	
	  System.out.println(rev);
	  }
	  }
	    
	        
	   

