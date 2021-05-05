package southwind.fokjoin;

import java.util.concurrent.RecursiveTask;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/5 19:26
 */

public class ForkJoinDemo extends RecursiveTask<Long> {

    private Long start;
    private Long end;
    private Long temp = 1_000_000L;

    public ForkJoinDemo(Long start, Long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if ((end-start) <= temp) {
            Long sum = 0L;
            for (Long i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        } else {
            Long avg = (start + end) / 2;
            // System.out.println("平均值为：" + avg);
            ForkJoinDemo task1 = new ForkJoinDemo(start, avg);
            task1.fork();
            ForkJoinDemo task2 = new ForkJoinDemo(avg, end);
            task2.fork();

            return task1.join() + task2.join();
        }
    }
}
