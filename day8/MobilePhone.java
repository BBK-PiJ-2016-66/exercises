/**
 * A mobile phone class
 */
public class MobilePhone extends OldPhone {

    /**
     * @var last numbers called
     */
    private String[] lastNumbers = new String[10];
    
    /**
     * Constructor
     * @param brand
     */
    public MobilePhone(String brand) {
        super(brand);
    }
    
    /**
     * @Override
     */
    public void call(String number) {
        super.call(number);
        this.addNumber(number);        
    }
    
    protected void addNumber(String number) {
        String[] newNumbers = new String[10];
        newNumbers[0] = number;
        
        for (int i = 0; i < lastNumbers.length - 1; i++) {
            if (lastNumbers[i] == null) {
                break;
            }
            newNumbers[i + 1] = lastNumbers[i];
        }
        
        lastNumbers = newNumbers;
    }

    /**
     * Rings an alarm
     */
    public void ringAlarm(String alarm) {
        System.out.println("Ringing " + alarm + "...");
    }

    /**
     * Plays a game
     */
    public void playGame(String game) {
        System.out.println("Playing " + game + "...");
    }

    /**
     * Prints last called numbers
     */
    public void printLastNumbers() {
        System.out.println("Printing last 10 numbers called:");
        for (int i = 0; i < lastNumbers.length; i++) {
            if (lastNumbers[i] == null) {
                System.out.println(new String("  <empty>"));
            } else {
                System.out.println("  " + lastNumbers[i]);
            }
        }
    }
}
