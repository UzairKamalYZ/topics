package be.techfix.codility.challenges.PascalTriangle;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public int solution(boolean[] P){

        return getNumberOfTrueFields(P);
    }

    private int getNumberOfTrueFields(boolean[] input) {
        int totalTrueFields = 0;

            for(boolean in : input){
                if(in){
                    totalTrueFields++;
                }
            }
            while(input.length>1){
                boolean [] newInput = new boolean[input.length-1];
                for(int i=1; i<input.length; i++){
                    if(input[i - 1] || input[i]){
                        newInput[i-1] = true;
                        totalTrueFields++;
                    }else{
                        newInput[i-1] = false;
                    }
                }
                input = newInput;
            }
        return totalTrueFields;
    }
}
