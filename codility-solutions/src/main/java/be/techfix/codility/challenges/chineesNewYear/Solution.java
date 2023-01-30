package be.techfix.codility.challenges.chineesNewYear;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] A, int[] B) {

        List<DishTaste> dishTasteList = getDishTastes(A,B);

        if(isRotationImpossible(dishTasteList,A,B)){
            return -1;
        }else
            if(isNoRotationRequired(dishTasteList,A,B) || (A.length < 1)){
            return 0;
        }else{
            return minRotationToSpreadTaste(dishTasteList,A,B);
        }

    }

    private int minRotationToSpreadTaste(List<DishTaste> dishTasteList,int[]A,int[]B) {
        int tableTurns = 0;
        int[] reps = new int[B.length];
        int[] orignalB = B;
        while(!isNoRotationRequired(dishTasteList,A,B) && tableTurns < dishTasteList.size()-1) {
           // findRepitition(orignalB,B,reps);
            B = rotateOnce(B);
            dishTasteList = getDishTastes(A, B);
            tableTurns++;
        }
//        Arrays.sort(reps);
//        int rep = reps[reps.length - 1];
//        if(rep == tableTurns)
//            return -1 ;
//        else

        return tableTurns;
    }

    private int[] findRepitition(int[] rotatedB, int[] b, int[] reps) {
        for (int i = 0; i <= rotatedB.length - 1; i++) {
            if(rotatedB[i]==b[i]){
                reps[i] = reps[i]+1;
            }else{
                reps[i] = 0;
            }
        }
        return reps;
    }

    private int[] rotateOnce( int []B){

        int[] BNew= new int[B.length];
        for(int x = 0; x <= B.length-1; x++){
            BNew[(x+1) % B.length ] = B[x];
        }
         return BNew;
    }
    private boolean isNoRotationRequired(List<DishTaste> dishTasteList,int[] A, int [] B) {

        List<Integer> listA = Arrays.stream(A).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(B).boxed().collect(Collectors.toList());


        HashSet<Integer> AHashSet = new HashSet<>(listA);
        HashSet<Integer> BHashSet = new HashSet<>(listB);
        if(AHashSet.size() <=1 || BHashSet.size()<=1) {
            return true;
        }
        Optional<DishTaste> first = dishTasteList.stream()
                .filter(dishTaste -> dishTaste.dishB == dishTaste.dishA)
                .findFirst();
        return first
                .isEmpty();

    }

    private boolean isRotationImpossible(List<DishTaste> dishTasteList,int[]A, int[]B) {
        B = rotateOnce(B);
        int index = 0;
        List<DishTaste> dishTasteListA = getDishTastes(A, B);
            for(DishTaste dishTaste : dishTasteList){

                if(dishTaste.dishA !=
                        dishTasteListA.get(dishTasteListA.size()-1 - index).dishA){
                    return false;
                }


                index++;
            }
            return true;
    }

    private List<DishTaste> getDishTastes(int[] a, int[] b) {
        ArrayList<DishTaste> dishTastes = new ArrayList<>();
        for(int index=0; index<a.length; index++){
            dishTastes.add(new DishTaste(a[index],b[index]));
        }
        return dishTastes;
    }


    class DishTaste{
        private int dishA;
        private int dishB;

        public int getDishA() {
            return dishA;
        }

        public int getDishB() {
            return dishB;
        }

        public void setDishB(int dishB) {
            this.dishB = dishB;
        }

        public DishTaste(int dishA, int dishB) {
            this.dishA = dishA;
            this.dishB = dishB;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            DishTaste dishTaste = (DishTaste) o;
            return dishB == dishTaste.dishB && dishA == dishTaste.dishA;
        }

        @Override
        public int hashCode() {
            return Objects.hash(dishA, dishB);
        }
    }

}