
class Overloading
{
public void display(int a , int b,int c)
{
System.out.println("addition of two numbers:" +(a+b+c));
}
public void display(int d, int e)
{
System.out.println("addition of two numbers:"+(d+e));
}
public void display(String a)
{
System.out.println("string:"+a);
}
public void display(float m, float n)
{
System.out.println("addition of two numbers:"+(m+n));
}
public static void main(String[] args)
{
Overloading ob=new Overloading();
ob.display(5, 5,8);
ob.display(5,  8);
ob.display("Hello");
ob.display(8.9f,0.1f);
}
}




