/**
 * Phone laucher
 */
public class PhoneLauncher {
    
    /**
     * Main method
     */
    public static void main(String[] args) {    
        PhoneLauncher launcher = new PhoneLauncher();
        launcher.launch();
    }
    
    /**
     * Uses all methods in SmatPhone
     */
    public void launch() {
        SmartPhone smart = new SmartPhone();
        smart.call(new String("01111111111"));
        smart.call(new String("02222222222"));
        smart.call(new String("03333333333"));
        smart.ringAlarm(new String("7am"));
        smart.playGame(new String("PackMan"));
        smart.browseWeb(new String("http://dcs.bbk.ac.uk"));
        smart.printLastNumbers();
        String position = smart.findPosition();
        System.out.println("My position is " + position);        
    }
}
