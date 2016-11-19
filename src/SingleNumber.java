import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;




public class SingleNumber {
/**	Given an array of integers, every element appears twice except for one. Find that single one.
	分析：
	将每一个元素遍历后存储于hashMap中，如果出现一次加入hashmap，第二次出现则从hashmap中删除该元素，最后剩下的元素就是只出现过一次的
	####我的解决方案

	```*/
	 public int singleNumber(int[] nums) {
	        Map <Integer,Integer>map=new HashMap<Integer,Integer>();
	        for(int i=0;i<nums.length;i++){
	            if(map.get(nums[i])==null){
	                map.put(nums[i],1);
	            }else{
	               map.remove(nums[i]);
	            }
	        }
	        Iterator iter = map.entrySet().iterator();
	        Map.Entry entry = (Map.Entry) iter.next();
	        
	        return (int)entry.getKey();
	    }
	
}
