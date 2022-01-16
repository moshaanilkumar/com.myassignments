public class range {

	// To find mean of range in l to r
	static int findMean(int arr[], int l, int r)
	{
		// Both sum and count are
		// initialize to 0
		int sum = 0, count = 0;

		// To calculate sum and number
		// of elements in range l to r
		for (int i = l; i <= r; i++) {
			sum += arr[i];
			count++;
		}

		// Calculate floor value of mean
		int mean = (int)Math.floor(sum / count);

		// Returns mean of array
		// in range l to r
		return mean;
	}

	// Driver program to test findMean()
	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println(findMean(arr, 0, 2));
		System.out.println(findMean(arr, 1, 3));
		System.out.println(findMean(arr, 0, 4));
	}
}
