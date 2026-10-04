public interface Device {
    String getType();
    void turnOn();
    void setVolume(int volume);
    boolean isOn();
    int getVolume();
}