public class Comparator {
    /**
     * Cast arguments as doubles and go through...
     */
    public int getMax(int n, int m) {
        double d1 = (double) n;
        double d2 = (double) m;
        return (int) this.getMax(d1, d2);
    }
    
    /**
     * All comparisons are made here!
     */
    public double getMax(double d1, double d2) {
        if (d1 > d2) {
            return d1;
        } else {
            return d2;
        }
    }
    
    /**
     * Cast arguments as integers and go through...
     */
    public String getMax(String number1, String number2) {
        int n1 = Integer.parseInt(number1);
        int n2 = Integer.parseInt(number2);
        int r = this.getMax(n1, n2);
        return String.valueOf(r);
    }
}
