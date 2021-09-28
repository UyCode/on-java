package designpattern.src.memento;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 7/25/2021 1:16 PM
 */

public class EditorState extends History{

    private final String content;



    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
