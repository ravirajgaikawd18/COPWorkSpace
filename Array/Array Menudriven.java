package Array;

import java.util.Scanner;

public class Test155 
{

	public static void main(String[] args) 
	{
		int choice,n,sum=0;
		int size;
		boolean flag=false;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Array Size");
		size=sc.nextInt();
		int[]arr;
		arr=new int[size];
		System.out.println("1.Read Elements 2.Print Array Elements 3.Search element 4.Reverse Array 5.Even Number from Array 6.Sum of Element 7.Exit");
		
		do 
		{
			System.out.println("Enter choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1://read array
				System.out.println("Enter Array");
				for(int i=0;i<size;i++) 
				{
				System.out.println((i+1)+" Element ");
				arr[i]=sc.nextInt();
			
				}
				
			
			
			break;
			
		 case 2://print array
				System.out.println("Array Elements");
				
				for(int i=0;i<size;i++)
				{
					System.out.println(" "+arr[i]);
					
				}
				System.out.println();
				break;
		 case 3://search elements
			 System.out.println("Enter Number you want to search");
			 n=sc.nextInt();
			 for(int i=0;i<arr.length;i++) {
				 if(arr[i]==n) {
					 flag=true;
					 break;
				 }
			 }
			 if(flag==true) {
				 System.out.println(n+"Element Found");
			 }
			 else {
				 System.out.println(n+"Element Not Found");
				 
				 
			 }
			 System.out.println();
			 break;
			 
		 case 4://reverse array
			 System.out.println("Reverse Array");
			 for(int i=(size-1);i>=0;i--) {
				 System.out.println(arr[i]+" ");
				 
			 }
			 System.out.println();
			 break;
			 
		 case 5://even numbers
			 System.out.println("Even Numbers in Array");
			 for(int i=0;i<arr.length;i++)
			 {
				 if(arr[i]%2==0) {
					 System.out.println(arr[i]+" ");
				 }

				 }
			 System.out.println();
			 break;
			 
		 case 6://sum of elements
			 System.out.println("Sum of Elements");
			 for(int i=0;i<arr.length;i++)
				 sum=sum+arr[i];
			 {
				 System.out.println(" Sum of Elements " +sum);
				 
			 }
			 System.out.println();
			 break;
			 
		 case 7:
			 System.out.println("Exited Switchcase Successfully");
			 break;
			 default:
				 System.out.println("Invalid choice");		
					
			}		
		}
		while(choice!=7);
		
		
		

	}

}
