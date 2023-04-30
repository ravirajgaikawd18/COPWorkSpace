package Array;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter Number:");
		int no=sc.nextInt();
		int firstterm=0;
		int Secondterm=1;
		int ans=0;
		
		for(int i=1;i<=no;i++) {
			 ans=firstterm+Secondterm;
			firstterm=Secondterm;
			Secondterm=ans;
			
		}
		System.out.println("Fibonacci :"+ans);

	}

}
