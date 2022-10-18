package test;

class Bank {
	float getRateOfInterest(){
		return 0;
	}
 }
	class SBI extends Bank{
		float getRateOfInterest() {
			return 8;
		}
	}
	class ICICI extends Bank{
		float getRateOfInterest() {
			return 7;
		}
	}
	class AXIS extends Bank{
		float getRateOfInterest() {
			return 9;
		}
	}
 

public class Test {
public static void main(String[] args) {
		
		SBI obj=new SBI();  
		ICICI obj1=new ICICI();  
		AXIS obj2=new AXIS();  
		System.out.println("SBI Bank"+ " "  +obj.getRateOfInterest());
		System.out.println("ICICI Bank" + " "  +obj1.getRateOfInterest());
		System.out.println("AXIS Bank"+ " " +obj2.getRateOfInterest());
	}
}
