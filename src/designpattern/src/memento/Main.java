package designpattern.src.memento;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 7/25/2021 1:30 PM
 */

public class Main {
    public static void main(String[] args) {

        var editor = new Editor();

        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        // undo
        editor.restoreState(history.pop());

        System.out.println(editor.getContent());

        // undo
        editor.restoreState(history.pop());

        System.out.println(editor.getContent());
    }
}
