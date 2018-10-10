package com.cg.project.threadwork;

public class RunnableResource implements Runnable {

	@Override
	public void run() {
		try{Thread t = Thread.currentThread();
		if (t.getName().equals("evenThread")){
			for (int i = 1; i <= 10; i++){
				if (i % 2 != 0)
					System.out.println("odd	" + i);
				Thread.sleep(1000);
			}	
		}
		else if (t.getName().equals("oddThread")){
			for (int i = 1; i <= 10; i++){
				if (i % 2 == 0)
					System.out.println("even" + i);
				Thread.sleep(1000);
			}	
		}}
		catch(InterruptedException e){
			e.getStackTrace();
		}


	}
}
