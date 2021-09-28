package designpattern.src.state;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 7/25/2021 1:47 PM
 */

public class Main {

    public static void main(String[] args) {
        var canvas = new Canvas();

        canvas.setCurrentTool(new Selection());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new Brush());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new Eraser());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
