package designpattern.src.memento;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 7/25/2021 1:13 PM
 */

public class Editor{

    private String content;

    public EditorState createState() {
        return new EditorState(content);
    }

    public void restoreState(EditorState state) {
        content = state.getContent();
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
