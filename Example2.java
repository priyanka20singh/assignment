package test;

 public class Example2{
	 public Example2()
	 {
		 String name="Priyanka";
		 System.out.println("Account name" +name);
	 }
	 public  Example2(long accNumber, double balance) {
		 System.out.println("Account Number:" +accNumber +" "+ "Account Balance:" +balance);
	 }
	 
	 public static void main(String[]args) {
		 Example2 a = new Example2();
		 Example2 b = new Example2(123456789 , 100.65); 
	 }
 }
	 
	 
		 
 
