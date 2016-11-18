###292. Nim Game
You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner. You will take the first turn to remove the stones.

Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap.

For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.

Show Hint 
 
 分析：如果4个石头，我将无法获胜，分析发现如果是5，6，7个石头我将可以获胜，如果是8个石头我将无法获胜，9，10，11 我将无法获胜，动态规划，以此类推，发现只要是4的倍数都无法获胜；
####我的解决方案

```
public class Solution {
    public boolean canWinNim(int n) {
        if(n%4==0)return false;
        if(n%4<=3)return true;
        else return false;
        
    }
}
```
###其他人的解决方案

```
public boolean canWinNim(int n) {
        return n%4!=0; //lose at 4,8,12....
    }
```
####总结
这个题目是动态规划中比较简单的一个题
