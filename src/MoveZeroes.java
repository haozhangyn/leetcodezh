
public class MoveZeroes {
	
	/*Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

	For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

	Note:
	You must do this in-place without making a copy of the array.
	Minimize the total number of operations.

	分析：该题较为简单，用一个0计数器，计算零的个数，然后将非零数据向前移动。

	####我的解决方案：

	```*/
	   public void moveZeroes(int[] nums) {
	    /*   int p=nums.length-1;
	        int i=0;
	        while(i<nums.length&&p>0&&i<p){
	            if(nums[p]==0){
	               p--; 
	            }else if(nums[i]==0){
	                nums[i]=nums[p];
	                nums[p]=0;
	               
	                
	            }
	             i++;
	        }*/
	      //  for
	      int count=0;
	      for(int i=0;i<nums.length;i++){
	         if(nums[i]==0){
	             count++;
	         }else{
	             nums[i-count]=nums[i];
	             if(i!=(i-count)){
	                   nums[i]=0;
	             }
	           
	         }
	      }
	      
	        
	    }
	


}
