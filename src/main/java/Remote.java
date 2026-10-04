public abstract class Remote {
    protected Device device;
    private String id;
    protected int volumePreset;

    public Remote(String id, Device device) {
        this.id = id;
        this.device = device;
    }

    public void setImplementation(Device device) {
        this.device = device;
    }

    public String getId() {
        return id;
    }

    public abstract String execute();
}