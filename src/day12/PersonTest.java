import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testsNormalName() {
        Person p = new Person();
        String input = "Dereck Robert Yssirt";
        String output = p.getInitials(input);
        String expected = "DRY";
        assertEquals(output, expected);
    }

    @Test
    public void testsDoubleSpacedNameRaisesException() {
        Person p = new Person();
        String input = "Dereck  Yssirt";
        String output = p.getInitials(input);
        String expected = "DY";
        assertEquals(output, expected);
    }
}
