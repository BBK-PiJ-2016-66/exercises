package day15;

/**
 *
 * @author pedro
 */
public class Dogger {

    String doggyMethod(int n) {
        if (n <= 3) {
            return "";
        }

        String result = doggyMethod(n - 3) + n + doggyMethod(n - 2);

        return result;
    }
}
