package be.techfix.codility.lessons.frogjump;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertThat
                (new Solution().solution( 10 ,85 ,30))
                .isEqualTo(3);
        assertThat
                (new Solution().solution( 5 ,105 ,3))
                .isEqualTo(34);
        assertThat
                (new Solution().solution( 3 ,999111321 ,7))
                .isEqualTo(142730189);
    }
}