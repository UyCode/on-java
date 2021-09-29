package designpattern.factory;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/21/2021
 */

public class ComputerFactory {

    public Computer createComputer(String name) {
        Computer computer = null;
        if ("a".equals(name)) {
            computer = new ComputerA();
        }
        if ("b".equals(name)) {
            computer = new ComputerB();
        }
        return computer;
    }
}
