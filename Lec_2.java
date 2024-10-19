package Lec_1;

public class Lec_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=15161;
      int d=1;
      int cnt=0;
      while(n>0) {
    	  int lastDigit = n%10;
    	  if(lastDigit==d) {
    		  cnt++;
    	  }
    	  n=n/10;
      }
      
      
      System.out.println(cnt);
	}

}
