package designpattern.src.state.abuse;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 7/25/2021 1:58 PM
 */

public class RunningState implements State{

    private final StopWatch stopWatch;

    public RunningState(StopWatch stopWatch) {
        this.stopWatch = stopWatch;
    }

    @Override
    public void click() {
        stopWatch.setState(new StopState(stopWatch));
        System.out.println("Stopped");
    }
}
