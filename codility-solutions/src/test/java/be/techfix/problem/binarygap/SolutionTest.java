package be.techfix.problem.binarygap;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    public static Stream<Arguments> myTestSet() {
        return Stream.of(Arguments.arguments(9, 2),
                Arguments.arguments(32, 0),
                Arguments.arguments(1041, 5),
                Arguments.arguments(529, 4));

    }

    @ParameterizedTest
    @MethodSource("myTestSet")
    void should_be_able_to_calculate_to_binary_number_and_calculate_the_gap(int input, int expected) {
        Solution solution = new Solution();
        assertThat(solution.solution(input)).isEqualTo(expected);

    }
}