import java.util.Arrays;

/**
 * Created by zhanghao on 16-11-9.
 * Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1.

 Example:

 Input:
 [1,2,3]

 Output:
 3

 Explanation:
 Only three moves are needed (remember each move increments two elements):

 [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 *
 */
public class MinimumMovestoEqualArrayElements {
   /*my answer*/


       public int minMoves(int[] nums) {
           int index=0;
           int count=0;
           boolean flag=true;
           int numflag=0;
           Arrays.sort(nums);
           int leng=nums.length;
           while(nums[0]!=nums[leng-1]){
               count++;
               for(int i=1;i<leng-1;i++){
                   nums[i]++;
               }
               if(nums[leng-1]<nums[leng-2]){
                   int temp=nums[leng-1];
                   nums[leng-2]=nums[leng-1];
                   nums[leng-1]=temp;
               }

           }
           return count;
       }

    /*answer*/
    public int minMoves1(int[] nums) {
        if(nums.length==0)return 0;
        int count=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            count+=nums[i]-nums[0];
        }
        return count;
    }
}
