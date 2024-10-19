package Lec_1;

public class palendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {1, 2,3,3,2,1};
       int i=0;
       int flag=0;
       int j=a.length-1;
       while(i<j) {
    	   if(a[i]!=a[j]) {
    		   flag=1;
    		   System.out.println("Not a palen");
    		   break;
    	   }
    	   i++;
    	   j--;
       }
       if(flag==0)System.out.println("yes");
	}

}
