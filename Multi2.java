class Multi2 extends Thread{
	public void run(){
		System.out.println("running");
	
	}	
	public static void main(String[] args){
	Multi2 t1=new Multi2();
	Multi2 t2=new Multi2();
	t1.start();
	t2.start();
	System.out.println(t1.getName());
	System.out.println(t2.getName());
	t1.setName("maan");
	System.out.println(t1.getName());
	}
}
	