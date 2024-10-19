package Lec_1;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1 ,4 ,7,9,11,44,77,88};
		int target=66;
		System.out.println(BS(arr,target));
	}
	public static boolean BS(int arr[],int target) {
		int s=0;
		int e=arr.length-1;
		
		while(s<=e) {
			int mid=(s+e)/2;
			if(arr[mid]==target) return true;
			else if(arr[mid]>target)e=mid-1;
			else s=mid+1;
		}
		return false;
	}

}
