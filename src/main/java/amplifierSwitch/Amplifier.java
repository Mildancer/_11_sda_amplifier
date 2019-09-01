package amplifierSwitch;

public class Amplifier {
    double volume = 3;
    boolean turnedOn;

    public void setVolume(double newVolume) {
        if (newVolume > this.volume) {
            System.out.println("Zgłaśniam!");
        } else if (newVolume < this.volume) {
            System.out.println("Ciszej!");
        } else {
            System.out.println("Jest ok!");
        }
        this.volume = newVolume;
    }

    public void turnOn() {
        if (turnedOn == false) {
            System.out.println("wlaczam");
        } else {
            System.out.println("już wł");
        }
        this.turnedOn= true;
    }
}
