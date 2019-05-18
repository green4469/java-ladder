package ladder.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class RewardNameTest {
    @Test
    void nameLengthOverTest() {
        assertThrows(RuntimeException.class, () -> new RewardName("123456"));
    }

    @Test
    void nameLengthZeroTest() {
        assertThrows(RuntimeException.class, () -> new RewardName(""));
    }

    @Test
    void nameNullTest() {
        assertThrows(RuntimeException.class, () -> new RewardName(null));
    }
}
