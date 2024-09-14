package binary_Srch;

import java.util.Arrays;

public class Agg_cows {
	public static void main(String[] args) {
		int nstalls = 5;
		int ncows = 3;
		int[] brns = { 1, 2, 8, 4, 9 };
		Arrays.sort(brns);
		int s = brns[0];
		int e = brns[brns.length - 1] - brns[0];
		while (s <= e) {
			int mid = (s + e) / 2;
			if (possible(brns, mid, ncows) == true) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		System.out.println(e);
	}

	public static boolean possible(int[] brns, int dist, int cow) {
		int curcow = 1;
		int prevbrn = brns[0];
		for (int i = 0; i < brns.length; i++) {
			if (brns[i] - prevbrn >= dist) {
				curcow++;
				prevbrn = brns[i];
			}
			if (curcow >= cow)
				return true;
		}
		return false;
	}
}
