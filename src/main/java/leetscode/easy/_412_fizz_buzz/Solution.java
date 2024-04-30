package leetscode.easy._412_fizz_buzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> result=new ArrayList<>();

        for(int i=1;i<=n;i++){
            boolean divByThree=false;
            boolean divByFive=false;
            String rez="";
            if(i%3==0){
                rez="Fizz";
                divByThree=true;
            }
            if(i%5==0){
                rez="Buzz";
                divByFive=true;
            }
            if(divByThree && divByFive){
                rez="FizzBuzz";
            }

            if(rez.isEmpty()){
                result.add(String.valueOf(i));
            } else{
                result.add(rez);
            }
        }
        return result;
    }
}
