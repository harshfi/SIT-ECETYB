package Lec_1;

public class LinerSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int target=9;
        int arr[]= {7,8,1,7,3,5,6};
        boolean check=LinerS(arr,target);
        System.out.println(check);
	}
	public static boolean LinerS(int arr[],int target) {
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==target) return true;
		}
		
		return false;
	}

}
