##Reverse Vowels of a String
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".
我的解决方案：
1.首先建立一个hashMap，将“A” “E”...放入hashMap中<a,1>；
2 将字符串转为字符数组

      char[] chararray=s.toCharArray();
  3. 采用两个指针 一前一后，如果满足两个指针指的都在hashMap中存在，交换两个指针所指示的内容。
  

```
public class Solution {
    public String reverseVowels(String s) {
        Map map=new HashMap();
        map.put('a',1);
        map.put('e',1);
        map.put('i',1);
        map.put('o',1);
        map.put('u',1);
        map.put('A',1);
        map.put('E',1);
        map.put('I',1);
        map.put('O',1);
        map.put('U',1);
        char[] chararray=s.toCharArray();
        
        for(int i=0,j=chararray.length-1;i<j;){
            if(!map.containsKey(chararray[i])){
                i++;
                continue;
            }
            if(!map.containsKey(chararray[j])){
                j--;
                continue;
            }
            char temp=chararray[i];
           chararray[i]= chararray[j];
           chararray[j]=temp;
            i++;
            j--;
        }
        return new String(chararray);
        
    }
    /*********************将最后字符数组转为字符串方式改变**/
    public String reverseVowels(String s) {
        Map map=new HashMap();
        map.put('a',1);
        map.put('e',1);
        map.put('i',1);
        map.put('o',1);
        map.put('u',1);
        map.put('A',1);
        map.put('E',1);
        map.put('I',1);
        map.put('O',1);
        map.put('U',1);
        char[] chararray=s.toCharArray();
        
        for(int i=0,j=chararray.length-1;i<j;){
            if(!map.containsKey(chararray[i])){
                i++;
                continue;
            }
            if(!map.containsKey(chararray[j])){
                j--;
                continue;
            }
            char temp=chararray[i];
           chararray[i]= chararray[j];
           chararray[j]=temp;
            i++;
            j--;
        }
        return  String.valueOf(chararray);
        
    }
    /**********haset,时间没有提高***************/
     public String reverseVowels(String s) {
        Set set=new HashSet();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
       
        char[] chararray=s.toCharArray();
        
        for(int i=0,j=chararray.length-1;i<j;){
            if(!set.contains(chararray[i])){
                i++;
                continue;
            }
            if(!set.contains(chararray[j])){
                j--;
                continue;
            }
            char temp=chararray[i];
           chararray[i]= chararray[j];
           chararray[j]=temp;
            i++;
            j--;
        }
        return  String.valueOf(chararray);
        
    }
```


####其他人的答案:
发现其他人没有用hashMap，因为map中的value实际上是没有用的，就用了hashset，

```
public class Solution {
    private static final Set<Character> vowels = new HashSet<Character>() {{
        add('a');
        add('e');
        add('i');
        add('o');
        add('u');
        add('A');
        add('E');
        add('I');
        add('O');
        add('U');
    }};
    public String reverseVowels(String s) {
        char [] str = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while(start < end) {
            while(start < s.length() && !vowels.contains(str[start])) {start++;}
            while((end >= 0) && (!vowels.contains(str[end]))) {end--;}
            if(start < end) {
                char temp = str[start];
                str[start++] = str[end];
                str[end--] = temp;
            }
        }
        return String.valueOf(str);
    }
}
```

总结：
1. hashMap 与hashset的区别
2. 字符串转为字符数组 s.toCharArray()
3. 字符数组转换为字符串两种方式
	  （1）new String(chararray)
	  （2）String.valueOf(chararray)
	  第二种的转换效率要比第一种高


