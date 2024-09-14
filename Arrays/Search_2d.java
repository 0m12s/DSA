package Arrays;

import java.util.Scanner;

public class Search_2d {
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
		int ele = scn.nextInt();
		System.out.println(find(mat, ele));
	}

	private static boolean find(int[][] mat, int ele) {
		int r = 0;
		int c = mat[0].length - 1;
		while (r < mat.length && c >= 0) {
			if (mat[r][c] == ele) {
				System.out.print("{" + r + "," + c + "}" + " : ");
				return true;
			} else if (mat[r][c] > ele) {
				c--;
			} else {
				r++;
			}
		}
		return false;

	}
}
