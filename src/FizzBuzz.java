import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class FizzBuzz {
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
/**其他人的解决方案**/
/*	public List<String> fizzBuzz(int n) {
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
    }*/
}
