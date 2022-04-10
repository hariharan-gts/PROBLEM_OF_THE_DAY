package APRIL_2022;

import java.util.*;
//10-04-2022
public class cricket_tournament {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        ArrayList<String>li=new ArrayList<>();
        boolean flag=true;
        while(flag) {
        String t=sc.nextLine();
        if(t.charAt(0)=='q'||t.charAt(0)=='Q')
        	break;
        	li.add(t);
        
        }
        for(int i=0;i<li.size()-1;i++) {
        	for(int j=i+1;j<li.size();j++) {
        		System.out.println(li.get(i)+" vs "+li.get(j));
        	}
        }
	}

}
