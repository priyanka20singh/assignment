package test;


class A{
	public int i ,j;
	public void showij()
	{
		System.out.println(i);
		System.out.println(j);
		
	}
}
class B extends A
{
	public int k; 
	public void showk()
	{
		System.out.println(k);
	}

public void sum()
{
	int s=i+j+k;
	System.out.println(s);
}
}
public class Main {

	public static void main(String[] args) {
B obj=new B();
obj.i=10;
obj.j=(12);
obj.showij();
obj.k=13;
obj.showk();
obj.sum();

	}

}
