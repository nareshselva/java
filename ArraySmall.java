import java.util.Scanner;
class ArraySmall{
public static void main(String[] args){
	int sum=0;
	Scanner s =new Scanner(System.in);
	int n=s.nextInt();
		int arr[]=new int[n];
	for(int i=0;i<n;i++){
		 arr[i]=s.nextInt();
		 sum=sum+arr[i];
	}
	int small=arr[0];
	for(int i=1;i<n;i++){
	if(small>arr[i])
	{
	small=arr[i];
	
	}
	}
	System.out.println(small);
}
}