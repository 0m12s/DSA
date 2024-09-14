package Arrays;

public class Reverse {
public static void main(String[] args) {
int[] arr= {10,20,30,40,50};
rev(arr,0,arr.length-1);
disp(arr);
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
