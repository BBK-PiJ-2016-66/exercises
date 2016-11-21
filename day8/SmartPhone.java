/**
 * Smart phone class
 */
public class SmartPhone extends MobilePhone {

    /**
     * Makes calls over the Internet
     * @Override
     */
    public void call(String number) {
        if (number.substring(0, 2).equals("00")) {
            System.out.println("Calling " + number + " through the internet to save money...");
            this.addNumber(number);        
        } else {
            super.call(number);
        }
    }

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
