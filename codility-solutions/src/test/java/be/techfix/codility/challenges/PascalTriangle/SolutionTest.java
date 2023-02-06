package be.techfix.codility.challenges.PascalTriangle;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.arguments(new boolean[]{true, false, false, true, false}, 11),
                Arguments.arguments(new boolean[]{true, false, false, true}, 7),
                Arguments.arguments(new boolean[]{true}, 1),
                Arguments.arguments(new boolean[]{false}, 0),
                Arguments.arguments(new boolean[]{}, 0)

                );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    void should_return_number_of_true_fields(boolean[] input, int expected) {
        Solution solution = new Solution();
        assertThat(solution.solution(input)).isEqualTo(expected);
    }
}