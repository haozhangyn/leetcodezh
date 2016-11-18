###344. Reverse String  
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

####我的解决方案

```
public class Solution {
    public String reverseString(String s) {
        char[] charArray= s.toCharArray();
        StringBuffer result = new StringBuffer();
        
        for(int i=charArray.length-1;i>=0;i--){
            result.append(charArray[i]);
        }
        return result.toString();
    }
}

```
####别人的解决方案

```
public class Solution {
public String reverseString(String s) {
StringBuilder stringToReturn = new StringBuilder();
for (int i = 0; i < s.length(); i++){
stringToReturn.append(s.charAt(s.length()-i-1));
}
return stringToReturn.toString();
}
}
```
总结：
1. String类中使用字符数组保存字符串，如下就是，因为有“final”修饰符，所以可以知道string对象是不可变的。
2. StringBuilder与StringBuffer都继承自AbstractStringBuilder类，在AbstractStringBuilder中也是使用字符数组保存字符串，如下就是，可知这两种对象都是可变的
3. String中的对象是不可变的，也就可以理解为常量，显然线程安全。
4. StringBuffer对方法加了同步锁或者对调用的方法加了同步锁，所以是线程安全的
5. StringBuilder、StringBuffer的方法都会调用AbstractStringBuilder中的公共方法，如super.append(...)。只是StringBuffer会在方法上加synchronized关键字，进行同步
6. 用StringBuilder效率会更高，因为首先StringBuilder没有加锁，其次方法内部不存在线程安全问题。
