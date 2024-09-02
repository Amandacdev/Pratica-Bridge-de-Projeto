public class ClientBridge {
    
    public static void testDevice(Device device) {
        System.out.println("Testes com controle remoto básico.");
        Remote basicRemote = new Remote(device);
        basicRemote.togglePower();
        basicRemote.volumeUp();
        basicRemote.channelUp();
        device.printStatus();

        System.out.println("Testes com controle remoto avançado.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.togglePower();
        advancedRemote.mute();
        device.printStatus();
    }

    public static void main(String[] args) {
        Device tv = new Tv();
        Device radio = new Radio();

        testDevice(tv);
        testDevice(radio);
    }
}