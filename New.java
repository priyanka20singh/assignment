package test;
class New
{ 
public int add(int x, int y)// x & y is a paramenters
{
	int z= x+y;
	return z;
}
	public static void main(String[] args)
	{
	New a=new New();
	int a1=2;
	int b1=3;
	int c=a.add(a1, b1); // a1 and b1 is a arrgument
//	a.add();
	System.out.println(c);
	}
}
