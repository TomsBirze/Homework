package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {

        List<Sound> noise = new ArrayList<>();

        Parrot parrot = new Parrot();
        Radio radio = new Radio();
        Firework firework = new Firework();

        noise.add(parrot);
        noise.add(radio);
        noise.add(firework);
        noise.add(parrot);
        noise.add(radio);
        noise.add(firework);
        noise.add(radio);
        noise.add(firework);
        noise.add(parrot);

        noise.forEach(Sound::playSound);

    }
}
