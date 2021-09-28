package designpattern.adapter;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/21/2021
 */

public class Player {

    public void playMP3(String filename) {
        System.out.println("play mp3: " + filename);
    }
    public void playWma(String filename) {
        System.out.println("play Wma: " + filename);
    }
}
