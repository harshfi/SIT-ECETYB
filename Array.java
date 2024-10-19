package Lec_1;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[] = new int [5];
       
       for (int i = 0; i < a.length; i++) {
		a[i]=(5*(i+1));
	}
       for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
       
	}

}
