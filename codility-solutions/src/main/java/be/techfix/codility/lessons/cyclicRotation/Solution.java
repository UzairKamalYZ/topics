package be.techfix.codility.lessons.cyclicRotation;

public class Solution {
    public int[] solution(int[] A, int K) {
        if(A.length>0){
            return rotateArrayForTurns(A,K);
        }else return new int[]{};

    }

    private int[] rotateArrayForTurns(int[] input, int turns) {
        for (int turn = 0; turn < turns; turn++) {
            int temp;
            int i;
            int n = input.length;
            temp = input[n - 1];
            for (i = n - 1; i > 0; i--) {
                input[i] = input[i - 1];
            }
            input[0] = temp;

        }
        return input;
    }
}