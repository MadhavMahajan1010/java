/* it is used to wrap all the commands inside an object */
package BehaviouralDesignPattern;

class Channel {
    String name;
    Integer channelNo;

    Channel(String name, Integer channelNo) {
        this.name = name;
        this.channelNo = channelNo;
    }
}

class Tv {

    Channel channel;
    Integer volume;
    boolean state;
    
    public void turnOn(){
        this.state=true;
    }
    public void turnOff(){
        this.state=false;
    }
    public void changeChannel(Channel channel) {
        this.channel = channel;
    }

    public void increaseVolume() {
        volume++;
    }

    public void decreaseVolume() {
        volume--;
    }
 
}

class Remote {
    Tv tv;

    public void changeChannel(Channel channel) {
        this.tv.changeChannel(channel);
    }

    public void increaseVolume() {
        this.tv.increaseVolume();
    }

    public void decreaseVolume(){
        this.tv.decreaseVolume();
    }
    public void turnOff(){
        this.tv.turnOff();
    }
    public void turnOn(){
        this.tv.turnOn();
    }
}

public class commandDesignPattern {

}
