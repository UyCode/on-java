package designpattern.src.state.abuse;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 7/25/2021 1:58 PM
 */

public class StopState implements State{

    private final StopWatch stopWatch;

    public StopState(StopWatch stopWatch) {
        this.stopWatch = stopWatch;
    }

    @Override
    public void click() {
        stopWatch.setState(new RunningState(stopWatch));
        System.out.println("Running");
    }
}
