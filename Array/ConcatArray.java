package Array;

import java.util.Scanner;

public class concat 
{

	public static void main(String[] args) 
	{
		int []arr1=new int[4];
		int []arr2=new int[3];
		int[]arr3;
		Scanner sc= new Scanner (System.in);
		int size=arr1.length+arr2.length;
		arr3=new int[size];
		
		
		//read arr1
		System.out.println("Enter Array Elements");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
			
		}
		
		//read arr2
		System.out.println("Enter Array Elements");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
			
		}
for(int i=0;i<size;i++) {
	if(i<arr1.length)
	{
		arr3[i]=arr1[i];
	}
	else {
		arr3[i]=arr2[i-arr1.length];
		
	}
	System.out.println(arr3[i]+" ");
	
}
		
	}

}
