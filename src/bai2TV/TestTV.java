package bai2TV;

public class TestTV {
    public static void main(String[] args) {
        TV TV1 = new TV();
        TV1.setChannel(5);
        TV1.turnOn();
        TV1.setVolume(50);
        TV1.channelDown();
        TV1.volumeUp();
        System.out.println(TV1);
    }
}
