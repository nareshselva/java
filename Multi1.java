import java.util.Scanner;
class Multi1 extends Thread{
	public void run(){
	
		for(int i=0;i<4;i++){
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}	
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	Multi1 t1=new Multi1();
	Multi1 t2=new Multi1();
	t1.start();
	t2.start();
}
}
	