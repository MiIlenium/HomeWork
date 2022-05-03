package Device;

public class Device {

    String show;
    String desc;
    String sound;

    public Device(String show, String desc, String sound) {
        this.show = show;
        this.desc = desc;
        this.sound = sound;
    }

    public Device(){

    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
