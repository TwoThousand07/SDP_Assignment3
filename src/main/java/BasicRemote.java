public class BasicRemote extends Remote {
    public BasicRemote(String id, Device device) {
        super(id, device);
        this.volumePreset = 30;
    }

    @Override
    public String execute() {
        device.turnOn();
        device.setVolume(volumePreset);
        return String.format("Remote[%s] -> %s powered ON, volume %d",
                getId(), device.getType(), device.getVolume());
    }
}