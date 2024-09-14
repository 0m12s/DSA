package Arrays;

import java.util.Scanner;

public class zigzag2d {
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
		System.out.println("=========================");

		for (int col = 0; col < mat[0].length; col++) {
			for (int row = 0; row < mat.length; row++) {
				int rtp = row;            
				if (col % 2 == 1) {
					rtp = mat.length - 1 - row;
				}
				System.out.print(mat[rtp][col] + " ");
			}
			System.out.println();
		}
	}
}
