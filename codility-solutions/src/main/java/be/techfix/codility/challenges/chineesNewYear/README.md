There are N people sitting at a round table, having dinner. 
They are numbered from 0 to N-1 in clockwise order. 
Initially, each person has a dish on the table in front of them.
Person number K does not like the taste of A[K], but has a dish of taste B[K]. 
We want every person to have a dish of a taste that they do not dislike, 
i.e. A[K] ≠ B[K] for each K from 0 to N-1.

In order to achieve this, you can rotate the whole table clockwise by one position any number of times.
Rotating the table corresponds to moving the last element of B to the beginning.
For example, given A = [3, 6, 4, 5] and B = [2, 6, 3, 5], 
if we rotate the table once, we would obtain B = [5, 2, 6, 3].

Find the minimum number of table rotations that need to be performed in order to satisfy every person.

Write a function:

class Solution { public int solution(int[] A, int[] B); }

that, given arrays A and B, both consisting of N integers, representing tastes that people do not like and the taste of their dishes, respectively, returns the minimum number of table rotations required so that every person has a dish whose taste they do not dislike. In particular, if no rotations are needed, the function should return 0. If fulfilling the above condition is impossible, the function should return -1.

Examples:

1. Given A = [1, 3, 5, 2, 8, 7] and B = [7, 1, 9, 8, 5, 7],
your function should return 2. After rotating the table twice,
we obtain B = [5, 7, 7, 1, 9, 8], so A[K] ≠ B[K] for every K from 0 to 5.
If we rotated the table once, we would obtain B = [7, 7, 1, 9, 8, 5], 
which does not fulfil the condition, since A[4] = B[4] = 8. If we did not rotate the table at all, there would be A[5] = B[5] = 7. Note that rotating the table three times gives us B = [8, 5, 7, 7, 1, 9], which fulfils the condition too, but is not minimal.

2. Given A = [1, 1, 1, 1] and B = [1, 2, 3, 4], your function should return -1. It is impossible to rotate the table so that every person is satisfied. Someone will always have a dish of taste 1.

3. Given A = [3, 5, 0, 2, 4] and B = [1, 3, 10, 6, 7], your function should return 0. No rotation is needed to ensure that A[K] ≠ B[K].

Assume that:

N is an integer within the range [1..300];
each element of arrays A and B is an integer within the range [0..1,000];
arrays A and B have equal sizes.
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.

Copyright 2009–2023 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.




Solution
Programming language used
Java 11
Total time used
2 minutes
Effective time used
2 minutes
Notes
not defined yet
Task timeline

09:05:39
09:06:54
Code: 09:06:53 UTC, java11, final, score:  20
show code in pop-up
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
98
99
100
101
102
103
104
105

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

class Solution {
public int solution(int[] A, int[] B) {

        List<DishTaste> dishTasteList = getDishTastes(A,B);

        if(isRotationImpossible(dishTasteList)){
            return -1;
        }else if(isNoRotationRequired(dishTasteList)){
            return 0;
        }else{
            return minRotationToSpreadTaste(dishTasteList,A,B);
        }

    }

    private int minRotationToSpreadTaste(List<DishTaste> dishTasteList,int[]A,int[]B) {
        int tableTurns = 0;
        while(!isNoRotationRequired(dishTasteList)) {
            B = rotateOnce(B);
            dishTasteList = getDishTastes(A, B);
            tableTurns++;
        }

        return tableTurns;
    }

    private int[] rotateOnce( int []B){

        int[] BNew= new int[B.length];
        for(int x = 0; x <= B.length-1; x++){
            BNew[(x+1) % B.length ] = B[x];
        }
         return BNew;
    }
    private boolean isNoRotationRequired(List<DishTaste> dishTasteList) {
        return dishTasteList.stream()
                .filter(dishTaste -> dishTaste.dish== dishTaste.taste)
                .findFirst()
                .isEmpty();

    }

    private boolean isRotationImpossible(List<DishTaste> dishTasteList) {
        List<DishTaste> unique = dishTasteList.stream()
                .collect(collectingAndThen(toCollection(()
                                -> new TreeSet<>(comparingInt(DishTaste::getTaste))),
                        ArrayList::new));
        return dishTasteList.size() != unique.size();
    }

    private List<DishTaste> getDishTastes(int[] a, int[] b) {
        ArrayList<DishTaste> dishTastes = new ArrayList<>();
        for(int index=0; index<a.length; index++){
            dishTastes.add(new DishTaste(a[index],b[index]));
        }
        return dishTastes;
    }


    class DishTaste{
        private int taste;
        private int dish;

        public int getTaste() {
            return taste;
        }

        public int getDish() {
            return dish;
        }

        public void setDish(int dish) {
            this.dish = dish;
        }

        public DishTaste(int taste, int dish) {
            this.taste = taste;
            this.dish = dish;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            DishTaste dishTaste = (DishTaste) o;
            return dish == dishTaste.dish && taste == dishTaste.taste;
        }

        @Override
        public int hashCode() {
            return Objects.hash(dish, taste);
        }
    }

}
Analysis summary
The following issues have been detected: wrong answers, timeout errors.

For example, for the input ([1], [1]) the solution exceeded the time limit.

Analysis
expand allExample tests
▶ example1
First example test. ✔OK
▶ example2
Second example test. ✔OK
▶ example3
Third example test. ✔OK
expand allCorrectness tests
▶ simple
Simple tests. ✘TIMEOUT ERROR
Killed. Hard limit reached: 11.000 sec.
▶ small
Small randomized tests, N ~ 10. ✔OK
▶ two_values
Tests with only two different values. ✘WRONG ANSWER
got -1 expected 2
▶ multiple_dislikes
Tests where in each wrong rotation there are at least two disliked dishes. ✘WRONG ANSWER
got -1 expected 2
1. 0.028 s WRONG ANSWER,  got -1 expected 2
2. 0.028 s WRONG ANSWER,  got -1 expected 1
   ▶ permutations
   Tests with arrays being permutations of numbers from 1 to N. ✔OK
   ▶ equal_rotated
   Tests where B is equal to A, but rotated. ✘WRONG ANSWER
   got -1 expected 2
   ▶ one_correct
   Only one correct rotation exists. ✘WRONG ANSWER
   got -1 expected 5
   ▶ big
   Big randomized tests. ✘WRONG ANSWER
   got -1 expected 201
   ▶ big_edge_cases
   Big edge cases. ✘WRONG ANSWER
   got -1 expected 299
   ▶ last_rotation
   The result is equal to the last rotation. ✘WRONG ANSWER
   got -1 expected 299