package Lab_02;

import java.util.Scanner;

public class mainQueue {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		QueueX printerQueue = new QueueX(5);
		QueueX evenQueue = new QueueX(5);
		QueueX oddQueue = new QueueX(5);
		
		int no1 = 0; 
		int no2 = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter transaction ID " + (i + 1) + ": ");
			int no = scn.nextInt();
			printerQueue.insert(no);

			if (no % 2 == 0) {
				evenQueue.insert(no);
				no1++;
			} else {
				oddQueue.insert(no);
				no2++;
			}
		}

		System.out.println("PC1");
		for (int i = 0; i < no1 ; i++) {
			System.out.println("\tTransaction" + evenQueue.remove());
		}
		System.out.println("PC2");
		for (int i = 0; i < no2; i++) {
			System.out.println("\tTransaction" + oddQueue.remove());
		}
	}

}
