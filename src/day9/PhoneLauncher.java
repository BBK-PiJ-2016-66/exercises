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
        Mobilephone myPhone = new SmartPhone("Samsung");
        myPhone.call(new String("01111111111"));
        myPhone.call(new String("02222222222"));
        myPhone.call(new String("03333333333"));
        myPhone.call(new String("00444444444"));
        myPhone.ringAlarm(new String("7am"));
        myPhone.playGame(new String("PackMan"));
        myPhone.browseWeb(new String("http://dcs.bbk.ac.uk"));
        myPhone.printLastNumbers();
        String position = myPhone.findPosition();
        System.out.println("My position is " + position);
        
        this.testPhone(myPhone);
    }
    
    public void testPhone(Phone phone) {
        phone.call(new String("01111111111"));
        
        SmartPhone myPhone = (SmartPhone) phone;
         myPhone.call(new String("01111111111"));
        myPhone.call(new String("02222222222"));
        myPhone.call(new String("03333333333"));
        myPhone.call(new String("00444444444"));
        myPhone.ringAlarm(new String("7am"));
        myPhone.playGame(new String("PackMan"));
        myPhone.browseWeb(new String("http://dcs.bbk.ac.uk"));
        myPhone.printLastNumbers();
        String position = myPhone.findPosition();
        System.out.println("My position is " + position);
   }
}
