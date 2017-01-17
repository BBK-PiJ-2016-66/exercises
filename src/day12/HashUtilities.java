
public class HashUtilities {

    /**
     * Calculates short hash, >= 0 and <= 1000, for any given integer.
     *
     * @param number
     * @return 
     */
    public static int shortHash(int number) {
        int hash = Math.abs(number) % 1000;
        return hash;
    }
}
