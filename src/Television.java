
    public class Television {

    private boolean isOn = false;
    private int volume = 0;
    private int channel = 1;
    private int brightness = 50;
    private boolean isMuted = false;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void changeChannel(int newChannel) {
        if (newChannel > 0) {
            channel = newChannel;
        }
    }

    public void increaseBrightness() {
        if (brightness < 100) {
            brightness++;
        }
    }

    public void decreaseBrightness() {
        if (brightness > 0) {
            brightness--;
        }
    }

    public void mute() {
        isMuted = true;
    }

    public void unmute() {
        isMuted = false;
    }

    public boolean getPowerStatus() {
        return isOn;
    }

    public int getVolume() {
        return volume;
    }

    public int getChannel() {
        return channel;
    }

    public int getBrightness() {
        return brightness;
    }

    public boolean getMuteStatus() {
        return isMuted;
    }
}
