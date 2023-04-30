package Array;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		int size,n;
		int []arr;
		int sum=0;
		int choice;
		
		
		boolean flag=false;
		Scanner sc=new Scanner (System.in);
	
		System.out.println("Enter array Size");
		size=sc.nextInt();
		arr=new int[size];
		System.out.println("1.Read Arary 2.Print Array 3.Search Element in Array ");
		
		do 
		{
			System.out.println("Enter Choice");
			choice=sc.nextInt();
		
		switch(choice) 
		{
		
		//to read array
		 
		case 1:	System.out.println("Enter array Elements");
		for(int i=0;i<size;i++) 
		{
			System.out.println(i+1+" Element ");
			arr[i]=sc.nextInt();
		}
		break;
		//to print array
		case 2:System.out.println(" Array Elements ");
		for(int i=0;i<size;i++) 
		{
			System.out.println(" "+arr[i]);
		}
		System.out.println();
		break;
		
		//to search elements in array
		case 3:System.out.println("Enter Number you want to search");
		n=sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			if(arr[i]==n)
			{
				flag=true;
			break;
			}
		}
		if(flag==true)
		{
			System.out.println(n+" Number is found ");
		}
		else
		{
			System.out.println(n+" Number is not found ");
		}
		break;
		default:
			System.out.println("Invalid choice");
			break;
		
		}
		
			
		}while(choice!=3);
	
		
	}
}
	
