package Array;

public class Armstrong {

	public static void main(String[] args) {
		int no=153;
		int temp=no;
		int ans = 0,a;
		while(no>0)
		{
			a=no%10;
			int arm = a*a*a;
			ans=ans+arm;
			no=no/10;
			
		}
		if(ans==temp)
		{
			System.out.println("Number is Armstrong Number");
		}
		else {
			System.out.println("Number is not Armstrong Number");
		}
	}
}
