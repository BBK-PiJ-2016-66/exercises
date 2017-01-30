import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author pedro
 */
public class McCarthyTest {

    @Test
    public void testMcCarthy91() {
        McCarthy mcCarthy = new McCarthy();
        
        int[] tests = {50, 73, 95};
        int[] expected = {91, 91, 91};
        
        for (int i = 0; i < tests.length; i++) {
            int result = mcCarthy.mcCarthy91(tests[i]);
            assertEquals(expected[i], result);
        }
    }
}
