// Program to sort the array using Quick sort algorithm
public class QuickSort {
	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				// swapping the numbers less than pivot
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		return i; // returning pivot
	}

	public static void quickSort(int arr[], int low, int high) {
		if (low < high) {
			int pivind = partition(arr, low, high);
			quickSort(arr, low, pivind - 1);
			quickSort(arr, pivind + 1, high);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 8, 7, 2, 1, 0, 9, 6 };
		int n = arr.length;
		quickSort(arr, 0, n - 1);

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
