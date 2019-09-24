import java.util.Scanner;
class Array{
public static void main(String[] args){
	int sum=0;
	Scanner s =new Scanner(System.in);
	int n=s.nextInt();
		int arr[]=new int[n];
	for(int i=0;i<n;i++){
		 arr[i]=s.nextInt();
		 sum=sum+arr[i];
	}
	for(int i=0;i<n;i++){
	System.out.println(arr[i]);
	System.out.println(sum);
	}
}
}