public class QuietRemote extends Remote {
    public QuietRemote(String id, Device device) {
        super(id, device);
        this.volumePreset = 5;
    }

    @Override
    public String execute() {
        device.turnOn();
        device.setVolume(volumePreset);
        return String.format("QuietRemote[%s] -> %s powered ON, volume %d (Quiet)",
                getId(), device.getType(), device.getVolume());
    }
}