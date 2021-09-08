package designpattern.src.state.abuse;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 7/25/2021 1:54 PM
 */

public class StopWatch {

    private State state= new StopState(this);

    public void click() {
        state.click();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
