package be.techfix.codility.challenges.chineesNewYear;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Solution {
    public int solution(int[] A, int[] B) {

        List<DishTaste> dishTasteList = getDishTastes(A, B);

        if (isNoRotationRequired(A, B) || (A.length < 1)) {
            return 0;
        } else {
            return minRotationToSpreadTaste(dishTasteList, A, B);
        }

    }

    private int minRotationToSpreadTaste(List<DishTaste> dishTasteList, int[] A, int[] B) {
        int tableTurns = 0;
        while (!isNoRotationRequired(A, B) && tableTurns < dishTasteList.size()) {
            B = rotateOnce(B);
            dishTasteList = getDishTastes(A, B);
            tableTurns++;
        }

        if (!isNoRotationRequired(A, B) && tableTurns == dishTasteList.size()) {
            return -1;
        }


        return tableTurns;
    }


    private int[] rotateOnce(int[] B) {

        int[] BNew = new int[B.length];
        for (int x = 0; x <= B.length - 1; x++) {
            BNew[(x + 1) % B.length] = B[x];
        }
        return BNew;
    }

    private boolean isNoRotationRequired(int[] A, int[] B) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B[i]) {
                return false;
            }
        }
        return true;
    }

    private List<DishTaste> getDishTastes(int[] a, int[] b) {
        ArrayList<DishTaste> dishTastes = new ArrayList<>();
        for (int index = 0; index < a.length; index++) {
            dishTastes.add(new DishTaste(a[index], b[index]));
        }
        return dishTastes;
    }


    static class DishTaste {
        private final int dishA;
        private int dishB;

        public DishTaste(int dishA, int dishB) {
            this.dishA = dishA;
            this.dishB = dishB;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            DishTaste dishTaste = (DishTaste) o;
            return dishB == dishTaste.dishB && dishA == dishTaste.dishA;
        }

        @Override
        public int hashCode() {
            return Objects.hash(dishA, dishB);
        }
    }

}