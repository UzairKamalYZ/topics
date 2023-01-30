package be.techfix.codility.challenges.yearOfTheRabbit;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void should_return_0_if_not_rotation_required() {
        Solution solution = new Solution();
        assertThat(solution.solution(new int[]{3, 5, 0, 2, 4}, new int[]{1, 3, 10, 6, 7})).isEqualTo(0);
    }

    @Test
    void should_return_minus_1_when_rotation_is_impossible() {
        Solution solution = new Solution();
        assertThat(solution.solution(new int[]{1, 1, 1, 1}, new int[]{1, 2, 3, 4})).isEqualTo(-1);

    }

    @Test
    void should_return_minimum_rotation_to_spread_taste_around_the_table() {
        Solution solution = new Solution();
        assertThat(solution.solution(new int[]{1, 3, 5, 2, 8, 7}, new int[]{7, 1, 9, 8, 5, 7})).isEqualTo(2);
    }
}