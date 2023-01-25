package be.techfix.codility.lessons.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public int solution(int[] A){
        Arrays.sort(A);
        List<Integer> numbers = Arrays.stream(A).boxed().collect(Collectors.toList());

        int leastPositive = 0;
        Integer lastInteger = numbers.get(numbers.size()-1);
        if(lastInteger <0){
            return 1;
        }else{
            for(int i =0; i<lastInteger; i++){
                if(!numbers.contains(i)){
                    leastPositive =i;
                }
            }
            if(leastPositive == 0){
                leastPositive = lastInteger +1 ;
            }
            return leastPositive;
        }

    }

}
