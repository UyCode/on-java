package designpattern.adapter;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/21/2021
 */

public interface MusicPlayer {
    
    /**
     * play
     * @param type
     * @param filename
     * @return void 
     */
    void play(String type, String filename);
}
