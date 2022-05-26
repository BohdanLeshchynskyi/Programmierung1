package sequence;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class SequenceTest {
    private Sequence sequence;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        sequence = new Sequence();
    }

    @org.junit.jupiter.api.Test
    void lustigTest() {
        assertEquals(new BigDecimal(1), sequence.lustig(0));
        assertEquals(new BigDecimal(102967285835.149658203125), sequence.lustig(13));

        assertThrows(IllegalArgumentException.class, () -> sequence.lustig(-1));
    }
}