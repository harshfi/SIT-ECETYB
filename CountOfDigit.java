package Lec_1;

public class CountOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=153;
       int cnt=0;
       while(n>0) {
    	   cnt++;
    	   n=n/10;
       }
       
       System.out.println(cnt);
	}

}
