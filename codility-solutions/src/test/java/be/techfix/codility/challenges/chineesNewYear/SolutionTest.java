package be.techfix.codility.challenges.chineesNewYear;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.arguments(
                        new int[]{1, 1, 3, 4},
                        new int[]{1, 1, 5, 6}, -1
                ),
                Arguments.arguments(
                        new int[]{1, 1, 1, 4},
                        new int[]{1, 1, 1, 5}, -1
                ),
                Arguments.arguments(
                        new int[]{},
                        new int[]{}, -1
                ),
                Arguments.arguments(
                        new int[]{1,2},
                        new int[]{1,1}, 0
                ),
                Arguments.arguments(
                        new int[]{1},
                        new int[]{2}, 0
                ),
                Arguments.arguments(
                        new int[]{1,1,1,4},
                        new int[]{4,1,1,1}, -1
                )

        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void should_return_minimum_rotation_to_spread_taste_around_the_table(int[] A, int[] B, int expected) {
        Solution solution = new Solution();
        assertThat(solution.solution(A, B
        )).isEqualTo(expected);
    }

    @Test
    void should_return_0_if_not_rotation_required() {
        Solution solution = new Solution();
        assertThat(solution.solution(new int[]{3, 5, 0, 2, 4},
                new int[]{1, 3, 10, 6, 7}))
                .isEqualTo(0);
    }

    @Test
    void should_return_minus_1_when_rotation_is_impossible() {
        Solution solution = new Solution();
        assertThat(solution.solution(
                new int[]{1, 1, 1, 1},
                new int[]{1, 2, 3, 4}))
                .isEqualTo(-1);

    }

    @Test
    void should_return_minimum_rotation_to_spread_taste_around_the_table() {
        Solution solution = new Solution();
        assertThat(solution.solution(
                new int[]{1, 3, 5, 2, 8, 7},
                new int[]{7, 1, 9, 8, 5, 7}))
                .isEqualTo(2);
    }
}