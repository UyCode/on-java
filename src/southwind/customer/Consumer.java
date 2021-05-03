package southwind.customer;

import java.util.concurrent.TimeUnit;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/27/2021 20:44
 */

public class Consumer {

    private Container container = null;

    public Consumer(Container container) {
        this.container = container;
    }

    public synchronized void consume() {
        for (int i = 0; i < 30; i++) {
            this.container.pop();
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
