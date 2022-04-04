package APRIL_2022;
import java.util.*;

//04-04-2022

public class compress_string {
    public static String comp(String a) {
    	String ans="";
		int i,j=0;
		int cnt=1;
		for(i=0;i<a.length()-1;i++) {
			if(a.charAt(i)==a.charAt(i+1)) {
				cnt++;
			}
			else
			{
				ans=ans+a.charAt(i)+String.valueOf(cnt);
				cnt=1;
			}
			
		}
		if(cnt!=0) {
			ans=ans+a.charAt(a.length()-1)+String.valueOf(cnt);
		}
		
		return ans.length()>a.length()?a:ans;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String a=sc.next();
		
		System.out.println(comp(a));

	}

}
