package com.cg.project.threadwork;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		/*Runnable rn = new RunnableResource();
		
		Thread th1 = new Thread(rn, "oddThread");
		Thread th2 = new Thread(rn, "evenThread");
		
		th1.start();
		th1.join(5000);
		th2.start();
		
		System.out.println("mm");*/
		
		/*Runnable runnableResource = ()->{
			for(int i = 1;i<=10;i++)
				System.out.println("Tick "+i);
		};
		
		Thread th1 = new Thread(runnableResource);
		th1.start();*/
		
		new Thread(()->{for(int i = 1;i<=10;i++)
			System.out.println("Tick "+i);}).start();
		
		
	}

}
