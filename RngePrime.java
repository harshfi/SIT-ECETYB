package Lec_1;

public class RngePrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=2;i<=1000;i++) {
        	boolean check=prime(i);
        	if(check==true) {
        		System.out.println(i);
        	}
        }
	}
	public static boolean prime(int n) {
		
		for(int i=2;i<=n-1;i++) {
			
			if(n%i==0) return false;
		}
		return true;
	}

}
