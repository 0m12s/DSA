package Arrays;

public class subArry {
	public static void main(String[] args) {
		int[] arr = { 10,20,30,-40,50,-71,40,20,25 };
		//SubArray(arr);
	//	SubArray2(arr);
		kadance(arr);
	}
	private static void kadance(int[] arr) {
		// TODO Auto-generated method stub
		int sum=0;
		int ans=0;
		{
			 for(int s=0;s<arr.length;s++) {
				 sum=sum+arr[s];
				 if(sum<0) {
					 sum=0;
				 }
				ans=Math.max(ans,sum);
			 }
			 System.out.println(ans);
		}
	}

	public static void SubArray2(int[] arr) {
		// TODO Auto-generated method stub
		
		for (int s = 0; s < arr.length - 1; s++) {
			int ans = 0;
			for (int e = s; e < arr.length; e++) {
				// disp(arr,s,e);
				ans = ans + arr[e];
				System.out.println(ans);
				
			}
			
		}
	}

	public static void SubArray(int[] arr) {
		for (int s = 0; s < arr.length - 1; s++) {
			for (int e = s; e < arr.length; e++) {
				// disp(arr,s,e);
				int ans = 0;
				for (int i = s; i <= e; i++) {
					ans = ans + arr[i];
				}
				System.out.println(ans);
			}
		}
	}

	public static void disp(int[] arr, int s, int e) {
		// TODO Auto-generated method stub
		for (int i = s; i <= e; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
