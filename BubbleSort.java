// Program to sort the array using Bubble sort algorithm
import java.util.Scanner;

public class BubbleSort {

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
		
		for(int i=0; i<a.length;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j]<a[j-1]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}

		System.out.println("Sorted array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
