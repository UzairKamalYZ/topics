package be.techfix.codility.lessons.demo;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {


    @Test
    void should_give_least_positive_number() {
        Solution solution = new Solution();
        assertThat(solution.solution(new int[]{1, 3, 6, 4, 1, 2})).isEqualTo(5);
        assertThat(solution.solution(new int[]{1,2,3})).isEqualTo(4);
        assertThat(solution.solution(new int[]{-1,-3})).isEqualTo(1);
    }
}