 class Inherit_doctor{
 String name="naresh";
 int age=21;
  public void getdata(){
		 System.out.println(name);
		 System.out.println(age);
	 }
 }
 class Hospital extends Inherit_doctor{
	 int num=8;
	 public void show(){
		 System.out.println(name);
	 }
 }
 class Main1{
	 public static  void main(String[] args)
	 {
		 Hospital h=new Hospital();
		 h.show();
		 h.getdata();
	 }
 }
 
		 
 