package designpattern.adapter;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/21/2021
 */

public class Run {
    public static void main(String[] args) {
        MusicPlayer player = new PlayerAdapter();
        player.play("mp3", "mp3Music.mp3");
        player.play("Wma", "WmaMusic.wma");
    }
}
