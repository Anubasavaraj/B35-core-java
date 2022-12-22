package org.tnsindia.multithreadingdemo;

public class SynchronizedMethodDemo {
	private int sum;

	synchronized void arraysum(int[] arr)
	{
		sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int itr = arr[i];
			System.out.println(Thread.currentThread().getName());
		}
		try {
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

}
}