package Lec_1;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {5,3,2,6,1,5,6};
       int target=12;
       int ans[]=tSum(arr,target);
       System.out.println(ans[0]+" "+ans[1]);
	}
	public static int[] tSum(int arr[],int target) {
		int ans[]= new int [2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]+arr[j]==target) {
					ans[0]=i;
					ans[1]=j;
					return ans;
				}
			}
		}
		return ans;
	}

}
