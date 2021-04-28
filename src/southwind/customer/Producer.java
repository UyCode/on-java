package southwind.customer;

import java.util.concurrent.TimeUnit;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/27/2021 20:41
 */

public class Producer {

    private Container container = null;

    public Producer(Container  container) {
        this.container = container;
    }

    public void product() {
        for (int i = 0; i < 30; i++) {
            try {
                Hamburger hamburger = new Hamburger(i);
                this.container.push(hamburger);
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
