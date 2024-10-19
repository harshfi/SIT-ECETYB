package Lec_1;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153;
		int cnt=Count(n);
		int sum=Sum(n,cnt);
		if(sum==n)System.out.println("ArmStrong");
		else System.out.println("Not a ArmStrong");

	}
	public static int Sum(int n,int cnt) {
		int sum=0;
		while(n>0) {
			int d=n%10;
			sum=sum+(int)Math.pow(d, cnt);
			n=n/10;
		}
		return sum;
	}
	public static int Count(int n) {
		int cnt=0;
		while(n>0) {
			cnt++;
			n=n/10;
		}
		return cnt;
	}

}
