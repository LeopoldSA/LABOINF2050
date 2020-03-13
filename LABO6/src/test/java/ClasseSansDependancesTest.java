import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClasseSansDependancesTest {

    @Test
    public void testCalculMoyenne () {
        assertEquals(4, ClasseSansDependances.calculMoyenne(3,5));
    }
}