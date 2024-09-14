package Arrays;

public class Jagged_Arr {
public static void main(String[] args) {
	int [][]mat=new int[5][1];
	mat[0]=null;
	System.out.println(mat[0]);
	System.out.println(mat[1]);
	System.out.println(mat[2]);
	System.out.println(mat[3]);
	System.out.println(mat[4]);
	mat[0]=new int[1];
	mat[1]=new int[2];
	mat[2]=new int[3];
	mat[3]=new int[4];
	mat[4]=new int[5];
	for(int row[]:mat) {
		for(int val:row) {
			System.out.print(val+" ");
		}
		System.out.println();
	}
	
}
}
