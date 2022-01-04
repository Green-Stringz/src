public class TestTV9_ex4 {
    public static void main(String[] args){
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.setChannel();
        tv2.setVolume();

        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel1);
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel1);
    }
}
