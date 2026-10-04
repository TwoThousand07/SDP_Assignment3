public class TvDevice implements Device {
    private boolean on = false;
    private int volume = 0;

    @Override public String getType() { return "TV"; }
    @Override public void turnOn() { this.on = true; }
    @Override public void setVolume(int volume) { this.volume = volume; }
    @Override public boolean isOn() { return on; }
    @Override public int getVolume() { return volume; }
}