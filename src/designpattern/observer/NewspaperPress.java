package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/20/2021
 */

public class NewspaperPress {

    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    private void notifyCustomers() {
        customers.forEach(customer -> customer.update());
    }

    public void newspaper() {
        this.notifyCustomers();
    }


}
