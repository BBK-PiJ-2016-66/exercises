/**
 * Comparator test case
 */
public class ComparatorTest {
    
    /**
     * Main method
     */
    public static void main(String[] args) {    
        ComparatorTest test = new ComparatorTest();
        test.compare();
    }
    
    /**
     * Tests all available comparisons
     */
    public void compare() {
        Comparator comparator = new Comparator();
        
        // compare integers
        int i = comparator.getMax(0, 1);
        System.out.println("Yes, " + i + " > 0");
        
        // compare doubles
        double d = comparator.getMax(0.5, 1.5);
        System.out.println("Yes, " + d + " > 0.5");
        
        // compare strings
        String s = comparator.getMax("10", "20");
        System.out.println("Yes, " + s + " > 10");
    }
}
