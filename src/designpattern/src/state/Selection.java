package designpattern.src.state;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 7/25/2021 1:41 PM
 */

public class Selection implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("Selection icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed rectangle");
    }
}
