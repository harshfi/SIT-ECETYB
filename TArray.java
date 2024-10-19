package Lec_1;

import java.util.Arrays;

public class TArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[][]= {{5,3,9,-1},
    		       {1,2,3,4},
                   {6,7,8,9}}; 
       
       for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[0].length; j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
       
       Arrays.sort(a[0]);
       System.out.println("after sorting ");
       
       for (int i = 0; i < a.length; i++) {
   		for (int j = 0; j < a[0].length; j++) {
   			System.out.print(a[i][j]+" ");
   		}
   		System.out.println();
   	}
       
       
       
       
	}

}
