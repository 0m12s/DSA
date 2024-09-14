package binary_Srch;

public class Min_days_bouquet {
	public static void main(String[] args) {
		int n = 5;
		int[] arr = { 1, 10, 3, 10, 2 };
		int m = 3;
		int k = 1;
		System.out.println(min_d(arr, m, k));
	}

	private static int min_d(int[] arr, int m, int k) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		if(m*k>arr.length) {return -1;}
		for (int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		int low=min;
		int high=max;
		while(low<=high) {
			int mid=high+low/2;
			if(possible(arr,mid,m,k)) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		/*brute force!!
		 * for(int i=min;i<=max;i++) { if(possible(arr,i,m,k)==true) { return i; } }
		 */
		return low;
	}

	private static boolean possible(int[] arr, int day, int m, int k) {
		// TODO Auto-generated method stub
		int n_of_bqt = 0;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= day) {
				cnt++;
			} else {
				n_of_bqt += cnt / k;
				cnt=0;
			}
		}
		n_of_bqt += cnt / k;
		if (n_of_bqt >= m) {
			return true;
		} else {
			return false;
		}
	}
}
