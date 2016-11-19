import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;




public class SingleNumber {
/**	Given an array of integers, every element appears twice except for one. Find that single one.
	������
	��ÿһ��Ԫ�ر�����洢��hashMap�У��������һ�μ���hashmap���ڶ��γ������hashmap��ɾ����Ԫ�أ����ʣ�µ�Ԫ�ؾ���ֻ���ֹ�һ�ε�
	####�ҵĽ������

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
