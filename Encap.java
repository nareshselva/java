class Encap{
private String name;
private int num;
public int getnum(){
return num;
}
public String getname(){
return name;
}
public void setnum(int num1){
num=num1;
}
public void setname(String name1){
name=name1;
}
public static  void main(String[] args){
Encap e=new Encap();
e.setnum(5);
e.setname("Super");

System.out.println(e.getnum());
}
}
