package base.same.proxy;

/**
 * @author ahmatjan(UuCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/6/2021 00:32
 */

public class Destination {
    private String dist = "destination 1";

    public void todo() {
        System.out.println("control....");
        System.out.println(dist);
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }
}
