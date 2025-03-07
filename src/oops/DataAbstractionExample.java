package oops;


interface RemoteInterface {
    String turnOn();

    int goToChannel(int channelNumber);

    String increaseVolume();

    String decreaseVolume();
}

public class DataAbstractionExample implements RemoteInterface {


    public static void main(String[] args) {
        int channelNumber = 90;
        DataAbstractionExample dataAbstractionExample = new DataAbstractionExample();
        String turnOn = dataAbstractionExample.turnOn();
        System.out.println(turnOn);
        int channel = dataAbstractionExample.goToChannel(80);
        System.out.println(channel);
        String increseVol = dataAbstractionExample.increaseVolume();
        System.out.println(increseVol);
        String decreseVol = dataAbstractionExample.decreaseVolume();
        System.out.println(decreseVol);
    }

    @Override
    public String turnOn() {
        return "turn on";
    }

    @Override
    public int goToChannel(int channelNumber) {
        return channelNumber;
    }

    @Override
    public String increaseVolume() {
        return "volume increased";
    }

    @Override
    public String decreaseVolume() {
        return "volume decreased";
    }
}

