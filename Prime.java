package Lec_1;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int flag=0;
       int n=12;
       for (int i = 2; i <= n-1; i++) {
		
    	   if(n%i==0) {
    		   flag=1;
    		   System.out.println("Its not a prime number");
    		   break;
    	   }
	}
       if(flag==0) {
    	   System.out.println("prime number");
       }
	}

}
