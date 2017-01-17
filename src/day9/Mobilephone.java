/**
 * Just a  mobile phone interface
 */
public interface Mobilephone extends Phone {
    /**
     * Rings an alarm
     */
    public void ringAlarm(String alarm);

    /**
     * Plays a game
     */
    public void playGame(String game);

    /**
     * Prints last called numbers
     */
    public void printLastNumbers();
    
    /**
     * Just print on the screen: "Calling <number>...".
     */
    public void browseWeb(String url);
    
    /**
     * @return GPS-found position
     */
    public String findPosition();
}
