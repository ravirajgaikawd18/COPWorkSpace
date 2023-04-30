package Array;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int sum=0;
		int a=0;
		int temp=n;
		while(n>0)
		{
			
			a=n%10;
			sum=sum*10+a;
			n=n/10;
		}
	
	if(temp==sum) 
	{
		System.out.println(temp+" is palindrome");
	}
	else
	{
		System.out.println(temp+" Not Palindrome");
	}

	}

}
