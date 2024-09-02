public class Tv implements Device {
    private boolean enabled;
    private int volume;
    private int channel;
    private boolean smartTvOn;

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        this.enabled = true;
    }

    @Override
    public void disable() {
        this.enabled = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent >= 0 && percent <= 100) {
            this.volume = percent;
        } else {
            throw new IllegalArgumentException("Volume must be between 0 and 100");
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        if (channel > 0) {
            this.channel = channel;
        } else {
            throw new IllegalArgumentException("Channel must be greater than 0");
        }
    }

    @Override
    public void printStatus() {
        System.out.println("---------------------");
        System.out.println("TV Status:");
        System.out.println(" - Habilitada: " + (enabled ? "Sim" : "Não"));
        System.out.println(" - Volume: " + volume + "%");
        System.out.println(" - Canal: " + channel);
        System.out.println(" - Smart TV: " + (smartTvOn ? "on" : "off"));
        System.out.println("---------------------");
    }

    public void smartTvOn() {
        this.smartTvOn = true;
    }

    public void smartTvOff() {
        this.smartTvOn = false;
    }
}