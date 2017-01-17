public class IntegerTreeNodeTest {
    public static void main(String args[]) {
        test();
    }
    
    public static void test() {
        int[] values = {6, 5, 7, 8, 3, 2};
        
        System.out.println("Starting with " + values[0] + "...");
        IntegerTreeNode node = new IntegerTreeNode(values[0]);
        
        for (int i = 1; i < values.length; i++) {
            System.out.println("Adding " + values[i] + "...");
            node.add(values[i]);
        }
        
        System.out.println("Now seek for values...");        
        for (int i = 0; i < values.length; i++) {
            System.out.println(node.contains(values[i]) ? "Yeah, node contains " + values[i] : "Oops, " + values[i] + " is missing");
        }
        
        System.out.println("Min value is " + node.getMin());        
        System.out.println("Max value is " + node.getMax());        
   }
}
