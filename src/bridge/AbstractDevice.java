public  abstract class AbstractDevice {
    
    protected boolean on;
    protected int volume;
    protected int channel;

    public boolean isEnabled() {
        return on;
    }

    public void enable() {
        on = true;
    }

    public void disable() {
        on = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void printStatus() {
        System.out.println("---------------------");
        System.out.println("| O sistema está:" + (on ? "habilitado" : "desabilitado"));
        System.out.println("| O volume está em " + volume + "%");
        System.out.println("| O canal atual é " + channel);
        System.out.println("---------------------\n");
    }
}