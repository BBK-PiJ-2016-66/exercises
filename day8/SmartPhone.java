/**
 * Smart phone class
 */
public class SmartPhone extends MobilePhone {

    /**
     * Just print on the screen: "Calling <number>...".
     */
    public void browseWeb(String url) {
        System.out.println("Browsing " + url + "...");
    }
    
    /**
     * @return GPS-found position
     */
    public String findPosition() {
        return new String("123456,654321");
    }
    
}
