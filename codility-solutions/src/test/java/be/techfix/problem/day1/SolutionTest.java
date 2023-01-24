package be.techfix.problem.day1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SolutionTest {

    @Test
    void should_parse_the_incoming_input_tiles() {
        String[] input = {"RGBW", "GBRW"};
        Solution executor = new Solution();
        int actual = executor.solution(input);
        assertThat(actual).isEqualTo(2);
    }

    @Test
    void should_be_able_to_find_that_adjacent_tiles_are_pretty() {
        Solution executor = new Solution();
        assertThat(executor.adjacentTilesArePretty
                (Arrays.asList("RGBW", "GBRW"))).isFalse();
        assertThat(executor.adjacentTilesArePretty
                (Arrays.asList("RGBW", "BRWG"))).isTrue();

        assertThat(executor.adjacentTilesArePretty
                (Arrays.asList("RGBW", "BRWG","GBRW"))).isFalse();

        assertThat(executor.adjacentTilesArePretty
                (Arrays.asList("RGBW", "BRWG","WGBR"))).isTrue();
    }

    @Test
    void should_be_able_to_calculate_counter_clock_rotation_required_to_get_pretty() {
        Solution executor = new Solution();
        assertThat(executor
                .numberOfClockWiseTurnRequiredToGetSidesWithSameColor
                        ("RGBW", "RGBW"))
                .isEqualTo(2);
        assertThat(executor
                .numberOfClockWiseTurnRequiredToGetSidesWithSameColor
                        ("RGBW", "WBGR"))
                .isEqualTo(1);
        assertThat(executor
                .numberOfClockWiseTurnRequiredToGetSidesWithSameColor
                        ("RGBW", "WBGR"))
                .isEqualTo(1);
    }
    @Test
    void should_be_able_to_calculate_anti_counter_clock_rotation_required_to_get_pretty() {
        Solution executor = new Solution();
        assertThat(executor
                .numberOfAntiClockWiseTurnRequiredToGetSidesWithSameColor
                        ("RGBW", "RGBW"))
                .isEqualTo(2);
        assertThat(executor
                .numberOfAntiClockWiseTurnRequiredToGetSidesWithSameColor
                        ("RGBW", "WBGR"))
                .isEqualTo(3);
        assertThat(executor
                .numberOfAntiClockWiseTurnRequiredToGetSidesWithSameColor
                        ("RGBW", "GWBR"))
                .isEqualTo(1);
    }

    @Test
    void should_be_able_to_calculate_total_turns_required_to_get_pretty(){
        Solution executor = new Solution();
        String[] input = {"WBGR", "WBGR", "WRGB", "WRGB", "RBGW"};
        assertThat(executor
                .findTheTotalTurnToMakeTilesPretty(input))
                .isEqualTo(4);
//        assertThat(executor
//                .findTheTotalTurnToMakeTilesPretty(List.of
//                        ("RGBW", "GBRW")))
//                .isEqualTo(1);
    }
}