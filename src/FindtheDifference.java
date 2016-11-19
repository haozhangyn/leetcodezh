import java.util.HashMap;
import java.util.Map;


public class FindtheDifference {
	 public char findTheDifference(String s, String t) {
	        Map map=new HashMap<String,Integer>();
	        char[] chararray=s.toCharArray();
	        for(int i=0;i<chararray.length;i++){
	            if(map.get(chararray[i])==null){
	                map.put(chararray[i],1);
	            }else{
	                 map.put(chararray[i],(int)(map.get(chararray[i]))+1);
	            }
	        }
	        char[] tchararray=t.toCharArray();
	        for(int i=0;i<tchararray.length;i++){
	            if(!(map.containsKey(tchararray[i]))) return tchararray[i];
	            else{
	                 map.put(tchararray[i],(int)(map.get(tchararray[i]))-1);
	            }
	           
	            if(((int)map.get(tchararray[i]))==-1) return tchararray[i];
	        }
	        return 'a';
	    }
	 
	 /***其他人的答案*/
	/* public char findTheDifference(String s, String t) {
	        int sum1=0;
	        int sum2=0;
	        for(int i=0;i<s.length();i++){
	            sum1+=s.charAt(i);
	        }
	        for(int i=0;i<t.length();i++){
	            sum2+=t.charAt(i);
	        }
	        int a=sum2-sum1;
	        char c=(char)(a);
	        return c;
	            
	        
	    }*/
}
