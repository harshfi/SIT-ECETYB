package Lec_1;

public class CountOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {3,2,1,2,3,4,46,2,2};
        int cnt=0;
        for (int i = 0; i < a.length; i++) {
			
        	if(a[i]==2)cnt++;
		}
        System.out.println(cnt);
	}

}
