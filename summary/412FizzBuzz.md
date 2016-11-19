###412. Fizz Buzz
Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

```
Example:

n = 15,

Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]
```

我的解决方案：

      public List<String> fizzBuzz(int n) {
        List <String>res=new LinkedList<String>();
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0){
                res.add("FizzBuzz");
            }else if(i%3==0){
                res.add("Fizz");
            }else if(i%5==0){
                res.add("Buzz");
            }else{
                res.add(""+i);
            }
        }
        return res;
    }

####其他人的解决方案：

```
public List<String> fizzBuzz(int n) {
        String[] str = new String[n];
        for (int i = 0; i < n; i++) { 
            if ((i + 1) % 3 == 0) {
                if ((i+1) % 5 == 0) {
                    str[i] = "FizzBuzz";
                } else str[i] = "Fizz";
            } else if ((i+1) % 5 == 0) {
                str[i] = "Buzz";
            }else str[i] = Integer.toString(i + 1);
        }
        return Arrays.asList(str);
    }
```
总结：
用字符串数据代替list，最后再采用 Arrays.asList(str)方法将字符串数组转换为list
