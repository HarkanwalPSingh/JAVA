package com.cg.project.threadwork;

public class MyThread extends Thread {
	public MyThread(Runnable target, String name) {
		super(target, name);
	}
	@Override
	public void run() {
		try{
			if (this.getName().equals("oddThread")) {
				for (int i = 1; i <= 50; i++){
					if (i % 2 != 0)
						System.out.println("odd	" + i);
					Thread.sleep(1000);
				}	
			}

			else if (this.getName().equals("evenThread")) {
				for (int i = 1; i <= 50; i++){
					if (i % 2 == 0)
						System.out.println("even" + i);
					Thread.sleep(1000);
				}	
			}
		}
		catch(InterruptedException e) {
			e.getStackTrace();
		}
	}
}
