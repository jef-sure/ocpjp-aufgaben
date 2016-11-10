package _10_11;

import java.util.LinkedList;
import java.util.List;

public class Worker implements Runnable {
	List<String> toDeliver = new LinkedList<String>();

	public void deliver(String s) {
		synchronized (toDeliver) {
			toDeliver.add(s);
			toDeliver.notify();
		}
	}

	private void justSleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
		}
	}

	private void waitForDelivery() {
		synchronized (toDeliver) {
			while (toDeliver.isEmpty())
				try {
					toDeliver.wait();
				} catch (InterruptedException e) {
					System.out.println("Thread " + Thread.currentThread().getId() + " has interrupted wait");
				}
		}
	}

	@Override
	public void run() {
		while (true) {
			String got;
			synchronized (toDeliver) {
				waitForDelivery();
				got = toDeliver.remove(0);
				if (got.equals("finish your work")) {
					toDeliver.add(got);
					System.out.println("Thread " + Thread.currentThread().getId() + " is finished");
					// toDeliver.notify(); // why is this not needed?
					return;
				}
			}
			System.out.println("Thread " + Thread.currentThread().getId() + " delivers: " + got);
			justSleep(500);
		}
	}
}
