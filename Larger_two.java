import java.util.Scanner;
class Larger_two
{
public static void main(String[] args)
{
Scanner s =new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
if(a>b) 
{
	System.out.println(a+" is larger");
}
else
{
	System.out.println(b + "is larger");
}
}
}