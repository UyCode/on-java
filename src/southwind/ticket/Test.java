package southwind.ticket;


/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/27/2021 21:19
 */

public class Test {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(() -> {ticket.sale();}, "窗口A").start();
        new Thread(() -> {ticket.sale();}, "窗口B").start();
        new Thread(() -> {ticket.sale();}, "窗口C").start();
    }
}
