package base.same.proxy;

/**
 * @author ahmatjan(UuCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/6/2021 00:34
 */

public class DeviceController {

    private Device deviceName;

    private Destination destination;

    public void control(Destination destination) {
        destination.todo();
    }

    public Device getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(Device deviceName) {
        this.deviceName = deviceName;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }
}
