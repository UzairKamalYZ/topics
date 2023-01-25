package be.techfix.codility.lessons.day1;

import be.techfix.codility.challenges.prettyTiles.Solution;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class SolutionTest {

    @Test
    void should_parse_the_incoming_input_tiles() {
        String[] input = {"RGBW", "GBRW"};
        Solution executor = new Solution();
        assertThat(executor
                .solution(input))
                .isEqualTo(1);
    }

    @Test
    void should_be_able_to_calculate_total_turns_required_to_get_pretty() {
        Solution executor = new Solution();
        String[] input = {"WBGR", "WBGR", "WRGB", "WRGB", "RBGW"};
        assertThat(executor
                .solution(input))
                .isEqualTo(4);
    }

    @Test
    void should_be_able_to_calculate_total_turns_required_to_get_pretty2() {
        Solution executor = new Solution();
        String[] input = {"GBRW", "RBGW", "BWGR", "BRGW"};
        assertThat(executor
                .solution(input))
                .isEqualTo(2);
    }
}