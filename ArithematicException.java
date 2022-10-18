package test;

public class ArithematicException {

	public static void main(String[] args) {
	int a=100;
	try {
		int y= a/0;
	}catch(Exception e)
	{
		System.out.println(e);
	}

	}

}
