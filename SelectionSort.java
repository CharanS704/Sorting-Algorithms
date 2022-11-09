// Program to sort the array using Selection sort algorithm

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the length of array: ");
		int len = input.nextInt();
		int[] a = new int[len];

		System.out.println("Please enter " + len + " integer values: ");
		for (int i = 0; i < len; i++) {
			a[i] = input.nextInt();
		}
		System.out.println("Array is created and the values are:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < a.length - 1; i++) {
			int small = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[small] > a[j]) {
					small = j;
				}
			}
			int temp = a[small];
			a[small] = a[i];
			a[i] = temp;
		}

		System.out.println("Sorted array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
