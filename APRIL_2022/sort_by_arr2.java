package APRIL_2022;

//07-04-2022

import java.util.*;

public class sort_by_arr2 {
    public static ArrayList<Integer>ans(int a[],int b[]){
    	ArrayList<Integer>li=new ArrayList<Integer>();
    	HashMap<Integer,Integer>hs=new HashMap<>();
    	
    	for(int i=0;i<a.length;i++) {
    		if(!hs.containsKey(a[i])) {
    			hs.put(a[i], 1);
    		}else {
    			hs.put(a[i], hs.get(a[i])+1);
    		}
    	}
    	
    	for(int i=0;i<b.length;i++) {
    		if(hs.containsKey(b[i])) {
    			int t=hs.get(b[i]);
    			while(t>0) {
    				li.add(b[i]);
    				t--;
    			}
    			hs.put(b[i], 0);
    		}
    	}
    	Arrays.sort(a);
    	for(int i=0;i<a.length;i++) {
    		if(hs.get(a[i])==1) {
    			li.add(a[i]);
    		}
    	}
    	return li;
    }
	public static void main(String[] args) {
		int a[]= {2,3,1,3,2,4,6,7,9,2,19};
		int b[]= {2,1,4,3,9,6};
		System.out.println(ans(a,b));
	}

}
