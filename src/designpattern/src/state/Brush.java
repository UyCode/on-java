package designpattern.src.state;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 7/25/2021 1:44 PM
 */

public class Brush implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Brush icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line");
    }
}
