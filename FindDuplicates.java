import java.util.Scanner;
// Program to find the duplicates from user provided array
public class FindDuplicates {

	public static void main(String[] args) {
		int count=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the length of array: ");
		int len = input.nextInt();
		int[] a = new int[len];
		System.out.println("Please enter " + len + " integer values: ");
		for (int i = 0; i < len; i++) {
			a[i] = input.nextInt();
		}
		System.out.println("Array is created and the values are:");
		for (int i = 0; i < len; i++) {
			System.out.println("Value at index " + i + " is " + a[i]);
		}
		System.out.println();

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if(count>0)
				System.out.println("Value "+a[i]+" is present in the provided array multiple times");
				count = 0;
		}

	}

}
