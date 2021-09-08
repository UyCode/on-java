package designpattern.src.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 7/25/2021 1:18 PM
 */

public class History {


    private List<EditorState> editorStates = new ArrayList<>();

    public void push(EditorState state) {
        // add new state to history;
        editorStates.add(state);
    }

    public EditorState pop() {
        // get last index of history;
        var lastIndex = editorStates.size() -1;

        //get last state;
        var lastState = editorStates.get(lastIndex);

        // remove the last state from history;
        editorStates.remove(lastIndex);

        // return the previous state;
        return  lastState;

    }
}
