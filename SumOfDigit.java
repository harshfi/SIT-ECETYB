package Lec_1;
import java.util.*;
public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner h= new Scanner(System.in);
      int n=h.nextInt();
       int sum=0;
       while(n>0) {
    	  sum=sum+n%10;
    	  n=n/10;
       }
       System.out.println(sum);
	}

}
