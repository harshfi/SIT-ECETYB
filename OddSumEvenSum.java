package Lec_1;

public class OddSumEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {2,3,5,6,7};
      int even=0;
      int odd=0;
      for (int i = 0; i < a.length; i++) {
		
    	  if(a[i]%2==0) even=even+a[i];
    	  else odd=odd+a[i];
	}
      System.out.println(even);
      System.out.println(odd);
	}

}
