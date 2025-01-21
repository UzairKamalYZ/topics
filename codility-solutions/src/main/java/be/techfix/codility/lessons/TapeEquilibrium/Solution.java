package be.techfix.codility.lessons.TapeEquilibrium;

class Solution {
    public int solution(int[] A) {
        int N = A.length;

        // Step 1: Compute the total sum of the array
        int totalSum = 0;
        for (int i = 0; i < N; i++) {
            totalSum += A[i];
        }

        // Step 2: Initialize the left sum and the minimal difference
        int sumLeft = 0;
        int minDifference = Integer.MAX_VALUE;

        // Step 3: Iterate through possible splits (P = 1 to N-1)
        for (int P = 1; P < N; P++) {
            sumLeft += A[P - 1];
            int sumRight = totalSum - sumLeft;
            int difference = Math.abs(sumLeft - sumRight);

            // Update the minimum difference
            minDifference = Math.min(minDifference, difference);
        }

        // Step 4: Return the minimal difference
        return minDifference;
    }
}
