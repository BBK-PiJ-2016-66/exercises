
import org.junit.*;
import static org.junit.Assert.*;

public class HashUtilitiesTest {

    @Test
    public void testShortHash() {
        for (int i = -1000000; i < 1000000; i += 1000) {
            int hash = HashUtilities.shortHash(i);
            assertTrue(hash >= 0 && hash <= 1000);
        }
    }
}
