package badcode;

import static org.junit.jupiter.api.Assertions.*;

class BadCodeTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void PRINTsumandAVERAGE() {
        int array[] = {2, 3, 4};
        int return_value = 0;

        BadCode bc = new BadCode();

        return_value = bc.PRINTsumandAVERAGE(array);

        assertEquals(0, return_value);
    }
}
