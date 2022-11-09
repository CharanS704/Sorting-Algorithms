// Program to find if one of the array is subset of another array
import java.util.Arrays;

public class FindSubset {

	public static void main(String args[]) {
		int arr[] = {7,2,5,9};
		int arr1[]= {5,9,7};
		FindSubset obj = new FindSubset();
		String result = obj.isSubset(arr,arr1,arr.length,arr1.length);
		System.out.println(result);
	}
	public String isSubset( int arr1[], int arr2[], int n, int m) {
        int i=0,j=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while(i<n && j<m){
            if(arr1[i]==arr2[j]){
                i++;
                j++;
            }else{
                i++;
            }
        }
        if(j<m) 
        	return "No";
        else 
        	return "Yes";

    }
}
