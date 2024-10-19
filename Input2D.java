package Lec_1;
import java.util.*;
public class Input2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner h = new Scanner(System.in);
     int a[][]= new int[3][4];
     for(int i=0;i<3;i++) {
    	 for(int j=0;j<4;j++) {
    		 a[i][j]=h.nextInt();
    	 }
     }
     
     for(int i=0;i<3;i++) {
    	 for(int j=0;j<4;j++) {
    		 System.out.print(a[i][j]+" ");
    	 }
    	 System.out.println();
     }
     
     
     
     
	}

}
