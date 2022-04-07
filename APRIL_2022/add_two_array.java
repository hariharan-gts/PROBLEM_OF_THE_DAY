package APRIL_2022;
//07-04-2022
import java.util.Arrays;

public class add_two_array {
    public static String add(int []a,int []b) {
    	int n1=a.length;
    	int n2=b.length;
    	int n3=0;
    	
    	if(n1==n2)
    	 n3=n1+1;
    	else
    	  n3=Math.max(n2, n1);
    	int ans[]=new int[n3];
    	int c=0;
    	int s=0;
    	int k=ans.length-1;
    	int i=n1-1,j=n2-1;
        while(i>=0&&j>=0) {
        	s=a[i]+b[j]+c;
        	ans[k--]=s%10;
        	c=s/10;
            i--;
            j--;
        }
        if(c!=0) {
    		ans[k]=c;
    	}
    	while(i>=0) {
    		ans[k--]+=a[i--];
    	}
    	while(j>=0) {
    		ans[k--]+=b[j--];
    	}
    	
    	return Arrays.toString(ans);
    }
	public static void main(String[] args) {
		int a[]= {1,2};
		int b[]= {9,9};
		System.out.println(add(a,b));
	}

}
