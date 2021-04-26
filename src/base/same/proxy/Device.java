package base.same.proxy;

/**
 * @author ahmatjan(UuCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/6/2021 00:33
 */

public class Device {

    private String name;
    private DeviceController deviceController;

    public void control(Destination destination) {
        deviceController.control(destination);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeviceController getDeviceController() {
        return deviceController;
    }

    public void setDeviceController(DeviceController deviceController) {
        this.deviceController = deviceController;
    }
}
