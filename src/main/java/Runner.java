import amplifierSwitch.Amplifier;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();

        System.out.println("Wybierz opcje ");

        Scanner in = new Scanner(System.in);

        System.out.println("czy glosnik wlaczony. podaj tak- true, nie - false ");

        boolean input = in.nextBoolean();
        if (!input) {
            amplifier.turnOn();                                 //return; - wtedy metoda wyszlaby poza
        } else {
            amplifier.turnOn();

            System.out.println("podaj glosnosc");

            int newVolume = in.nextInt();

            System.out.println(newVolume);

//        int newVolume = 1;

            amplifier.setVolume(newVolume);
        }
    }
}
