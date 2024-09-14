package Arrays;

public class Rotation {
public static void main(String[] args) {
	int rot=3;
	int[] arr= {10,20,30,40,50};
	rotation(arr,rot); //Without extra space,no loop
	disp(arr);
}
	public static void rotation(int[] arr, int rot) {
	rot=rot%arr.length;
	rev(arr,0,arr.length-1);
	rev(arr,0,rot-1);
	rev(arr,rot,arr.length-1);
}
	public static int[] rev(int[] arr,int R,int L) {
		// TODO Auto-generated method stub
		while(L>R) {
			int temp=arr[L];
			arr[L]=arr[R];
			arr[R]=temp;
			L--;
			R++;
		}
		return arr;
	}
	public static void disp(int[] arr) {
		// TODO Auto-generated method stub
		for(int val:arr) {
			System.out.print(val+" ");
		}
	}
}
