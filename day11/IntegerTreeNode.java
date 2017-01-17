/**
 * Node of a binary tree of integers.
 */
public class IntegerTreeNode {
    private int value;
    private IntegerTreeNode next;
    private IntegerTreeNode left;
    
    /**
     * Constructor, creates new instance of IntegerTreeNode
     *
     * @return void
     */
    public IntegerTreeNode(int value) {
        this.value = value;
    }

    /**
     * Add new node to the tree
     *
     * @param int value
     * @return void
     */
    public void add(int value) {
        if (value > this.value) {
            if (this.next == null) {
                this.next = new IntegerTreeNode(value);
            } else {
                this.next.add(value);
            }
        } else {
            if (this.left == null) {
                this.left = new IntegerTreeNode(value);
            } else {
                this.left.add(value);
            }
        }
    }
    
    /**
     * Check the tree contains a given value.
     *
     * @param int value
     * @return boolean
     */
    public boolean contains(int value) {
        if (this.value == value) {
            return true;
        } else if(value > this.value) {
            if (this.next == null) {
                return false;
            } else {
                return this.next.contains(value);
            }
        } else {
            if (this.left == null) {
                return false;
            } else {
                return this.left.contains(value);
            }
        }
    }
    
    /**
     * Get min value
     * @return int
     */
    public int getMin() {
        if (this.left == null) {
            return this.value;
        }
        return this.left.getMin();
    }
    
    /**
     * Get max value
     * @return int
     */
    public int getMax() {
        if (this.next == null) {
            return this.value;
        }
        return this.next.getMax();
    }
}
