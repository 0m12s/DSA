package Arrays;

import java.util.Scanner;

public class Spiral {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int R = scn.nextInt();
		int C = scn.nextInt();
		int[][] mat = new int[R][C];
		for (int r = 0; r < mat.length; r++) {
			for (int c = 0; c < mat[0].length; c++) {
				mat[r][c] = scn.nextInt();
			}
		}
		int min_r = 0;
		int max_r = mat.length - 1;
		int min_c = 0;
		int max_c = mat[0].length - 1;
		int cnt = 0;
		int te = mat.length * mat[0].length;
		while (min_r <= max_r && min_c <= max_c) {
			for (int r = min_r; r <= max_r && cnt < te; r++) {
				System.out.print(mat[r][min_c] + " ");
				cnt++;
			}
			System.out.println();

			for (int c = min_c + 1; c <= max_c && cnt < te; c++) {
				System.out.print(mat[max_r][c] + " ");
				cnt++;
			}
			System.out.println();

			for (int r = max_r - 1; r >= min_r && cnt < te; r--) {
				System.out.print(mat[r][max_c] + " ");
				cnt++;
			}
			System.out.println();

			for (int c = max_c - 1; c >= min_c + 1 && cnt < te; c--) {
				System.out.print(mat[min_r][c] + " ");
				cnt++;
			}
			System.out.println();

			min_r++;
			max_r--;
			min_c++;
			max_c--;
		}
	}

}
