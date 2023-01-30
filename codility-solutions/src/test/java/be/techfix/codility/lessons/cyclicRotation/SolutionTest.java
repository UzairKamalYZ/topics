package be.techfix.codility.lessons.cyclicRotation;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.arguments(new int[]{3, 8, 9, 7, 6},3,new int[]{9, 7, 6, 3, 8}),
                Arguments.arguments(new int[]{0,0,0},1,new int[]{0,0,0}),
                Arguments.arguments(new int[]{1,2,3,4},4,new int[]{1,2,3,4}),
                Arguments.arguments(new int[]{},1,new int[]{})

        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    void should_rotate_array_for_turns(int[] input,int turns, int[] expected) {
        Solution solution = new Solution();
        assertThat(solution.solution(input,turns)).isEqualTo(expected);
    }
}