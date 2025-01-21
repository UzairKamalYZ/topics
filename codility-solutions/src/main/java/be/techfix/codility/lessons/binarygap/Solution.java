package be.techfix.codility.lessons.binarygap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(int N) {
        // Implement your solution here
        return getBinaryGap(Integer.toBinaryString(N));
    }

    private int getBinaryGap(String binaryString) {
        char[] chars = binaryString.toCharArray();
        boolean firstOne = false;
        List<Integer> zeroSequences = new ArrayList<>();
        int numberOfZero = 0;
        for (Character character : chars) {

            if (character == '1') {
                if (firstOne) {
                    zeroSequences.add(numberOfZero);
                    numberOfZero = 0;
                }
                firstOne = true;
            } else {
                numberOfZero++;
            }

        }
        return !zeroSequences.isEmpty() ? Collections.max(zeroSequences) : Integer.valueOf(0);
    }
}
