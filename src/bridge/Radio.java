public class Radio implements Device {
    private boolean on;
    private int volume;
    private int channel;
    private String modulation;

    public String getModulation() {
        return modulation;
    }

    public void setModulation(String modulation) {
        this.modulation = modulation;
    }

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent >= 0 && percent <= 100) {
            this.volume = percent;
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println("---------------------");
        System.out.println("| O sistema está:" + (on ? "habilitado" : "desabilitado"));
        System.out.println("| O volume está em " + volume + "%");
        System.out.println("| O canal atual é " + channel);
        System.out.println("| Modulação é " + modulation);
        System.out.println("---------------------\n");

    }
}