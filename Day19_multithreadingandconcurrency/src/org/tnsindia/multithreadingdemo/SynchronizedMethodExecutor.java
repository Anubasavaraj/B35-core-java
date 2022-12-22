package org.tnsindia.multithreadingdemo;


public class SynchronizedMethodExecutor {

	public static void main(String[] args) {
		SynchronizedMethodDemo m=new SynchronizedMethodDemo();
		Thread t1=new Thread(()->m.arraysum(new int[] {22,33,44,55,66}));
		Thread t2=new Thread(()->m.arraysum(new int[] {20,30,40,50,}));
		t1.start();
		t2.start();
}
}