package Zadatak3;
import java.util.*;
public class Counter {
	
	//Driver code
	public static void main(String[] args) {
	int arr[] = { 3, 5, 2, 15};
	int sum = 4;
	int n = arr.length;

	System.out.println(printAllSubsets(arr, n, sum));

	}
	
	//Function for every array
		static int printAllSubsets(int arr[], int n, int sum) {
			ArrayList<Integer> v = new ArrayList<>();
			return printAllSubsetsRec(arr, n, v, sum);
		}
	
	
	static int printAllSubsetsRec(int arr[], int n, ArrayList<Integer> v, int sum) {

// Condition if the
// sequence is found
		if (sum == 0) 
			return (int)v.size();
		

		if (sum < 0)
			return Integer.MAX_VALUE;

// Condition when no
// such sequence found
		if (n == 0)
			return Integer.MAX_VALUE;

// Calling for without choosing
// the current index value
		int x = printAllSubsetsRec(arr, n - 1, v, sum);

// Calling for after choosing
// the current index value
		v.add(arr[n - 1]);

		int y = printAllSubsetsRec(arr, n, v, sum - arr[n - 1]);
		v.remove(v.size() - 1);
      
      return Math.min(x, y);
      
      
}

	
}
