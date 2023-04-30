package Array;

public class Sorting {

	public static void main(String[] args) {
		int[]arr= {10,8,25,13,16,35,4};
		int i,j;
		
		
		for(i=0;i<arr.length;i++)
		{
			int temp;
			for(j=i+1;j<arr.length;j++) 
			{
				if(arr[i]>arr[j]) 
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			System.out.println(arr[i]+" ");
		}
		
		

	}

}
