package be.techfix.codility.lessons.OddOccurrencesInArray;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 2, 1, 2, 5}));
    }
    public int solution(int[] B) {
        // Implement your solution here
        int[] A = Arrays.stream(B).sorted().toArray();
        for(int i=0; i<A.length; i++) {
            if(i + 1 >= A.length){
                return A[i];
            }
            if(A[i]!=A[i+1]) {
                return A[i];
            }else{
                i++;
            }
        }
        return -1;
    }
}
