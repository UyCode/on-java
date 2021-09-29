package designpattern.adapter;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/21/2021
 */

public class PlayerAdapter implements MusicPlayer{

    private Player player;

    public PlayerAdapter() {
        this.player = new Player();
    }

    @Override
    public void play(String type, String filename) {
        if("mp3".equals(type)) {
            this.player.playMP3(filename);
        }
        if ("Wma".equals(type)) {
            this.player.playWma(filename);
        }
    }
}
