package com.example.Thread;

public class EvenOddThreadSequential {

	public static void main(String[] args) {
		NumberPrinter np = new NumberPrinter();
		Thread odd = new Thread(new OddThread(np),"Odd Thread");
		Thread even = new Thread(new EvenThread(np),"Even Thread");
		odd.start();
		even.start();
	}
}
	
	class EvenThread implements Runnable{
		private NumberPrinter np;
		public EvenThread(NumberPrinter np){
			this.np=np;
		}
		@Override
		public void run() {
				for(int i = 2; i <=10 ; i=i+2)
					try {
						np.evenPrinter(i);
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		}
	}
	
	class OddThread implements Runnable{
		private NumberPrinter np;
		public OddThread(NumberPrinter np){
			this.np=np;
		}
		@Override
		public void run() {
				for(int i = 1; i <=10 ; i=i+2)
					try {
						np.oddPrinter(i);
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		}
	}
	
	class NumberPrinter{
		private boolean iseven= false;
		
		public void oddPrinter(int i) throws InterruptedException{
			synchronized(this){
				while(iseven)
					wait();
				System.out.println(Thread.currentThread().getName()+":: "+i);
				iseven=true;
				notifyAll();
			}
		}
		
		public void evenPrinter(int i) throws InterruptedException{
			synchronized(this){
				while(!iseven)
					wait();
				System.out.println(Thread.currentThread().getName()+":: "+i);
				iseven=true;
				notifyAll();
			}
		}
	}
