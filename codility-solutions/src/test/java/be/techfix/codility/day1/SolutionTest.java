package be.techfix.codility.day1;

import be.techfix.codility.challenges.CarolOfTheCode.Solution;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class SolutionTest {

    public static Stream<Arguments> myTestSet() {
return Stream.of(
        Arguments.arguments(new String[]{"RGBW", "GBRW"}, 1),
        Arguments.arguments(new String[]{"WBGR", "WBGR", "WRGB", "WRGB", "RBGW"}, 4),
        Arguments.arguments(new String[]{"WBGR", "WBGR", "WBGR", "WBGR","WBGR", "WBGR","WBGR", "WBGR"}, 4),
        Arguments.arguments(new String[]{"GBRW", "RBGW", "BWGR", "BRGW"}, 2));

    }

    @ParameterizedTest
    @MethodSource("myTestSet")
    void should_be_able_to_calculate_total_turns_required_to_get_pretty(String[] input, int turnsExpected) {
        Solution executor = new Solution();
        assertThat(executor
                .solution(input))
                .isEqualTo(turnsExpected);
    }
}