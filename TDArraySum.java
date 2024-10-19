package Lec_1;

public class TDArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[][] ={{5,3,9,-1},
		          {1,2,3,4},
                   {6,7,8,9}};
       for (int i = 0; i < a.length; i++) {
    	   int sum=0;
		for (int j = 0; j < a[0].length; j++) {
			sum=sum+a[i][j];
		}
		System.out.println(sum);
	}
	}

}
