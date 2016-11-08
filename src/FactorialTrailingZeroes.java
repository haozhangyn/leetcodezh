/**
 * Created by zhanghao on 16-11-8.
 *Given an integer n, return the number of trailing zeroes in n!.

 Note: Your solution should be in logarithmic time complexity.

 Credits:
 Special thanks to @ts for adding this problem and creating all test cases.

 Subscribe to see which companies asked this question
 *
 */
public class FactorialTrailingZeroes {

        public int trailingZeroes(int n) {
            int temp=(int)(n/5);
            int res=temp;
            while(temp>=1){
                res=res+(int)temp/5;
                temp=(int)(temp/5);
            }


            return res;

    }
}
