package test;


public class Array1 {
	
	public static void main(String[] args) {
		
		int i=0, j, count = 0;
		int[] arr = {25, 35, 25, 65, 65, 34, 87, 67, 34, 25, 99, 88, 65};
		
		while(i < arr.length) 
		{
			j = i+1;
			while(j < arr.length)
			{		
				if(arr[i] == arr[j]) {
					count++;
					break;
				}
				j++;
			}
			i++;
		}
		System.out.println("\nThe Total Number of Duplicates  = " + count);
	}
}