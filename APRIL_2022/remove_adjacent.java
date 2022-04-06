package APRIL_2022;
//05-04-2022
import java.util.*;


public class remove_adjacent {
    public static  String remove(String s) {
    	HashMap<Character,Integer>hs=new HashMap<>();
    	String ans="";
    	for(int i=0;i<s.length();i++) {
    		if(!hs.containsKey(s.charAt(i))) {
    		hs.put(s.charAt(i), 1);	
    		}else {
    			hs.put(s.charAt(i), hs.get(s.charAt(i))+1);
    		}
    	}
    	for(Map.Entry<Character,Integer>e:hs.entrySet()) {
    		char k=e.getKey();
    		int v=e.getValue();
    		hs.put(k, v%2);
    	}
    	for(int i=0;i<s.length();i++) {
    		if(hs.get(s.charAt(i))==1) {
    			ans+=s.charAt(i);
    			hs.put(s.charAt(i), 0);
    		}
    	}
    		
    	return ans.length()==0?"Empty":ans;
    }
    public static String remove1(String s) {
    	String ans="";
    	Stack<Character>st=new Stack<>();
    	int i=s.length()-1;
    	while(i>=0) {
    		if(st.isEmpty()||st.peek()!=s.charAt(i)) {
    			st.add(s.charAt(i));
    			i--;
    		}else {
    			st.pop();
    			i--;
    		}
    	}
    	if(st.isEmpty())
    		return "Empty";
    	while(!st.isEmpty()) {
    		ans+=st.peek();
    		st.pop();
    	}
    	return ans;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(remove1(s));
	}

}
