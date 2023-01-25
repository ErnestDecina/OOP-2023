package ie.tudublin;

import ie.tudublin.Cat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Cat tara = new Cat("Tara");

        System.out.println(tara.getName());

        tara.speak();

        Cat ginger = new Cat("Ginger");

        // Killing the cat
        while (ginger.getNumLives() != 0) {            
            ginger.kill();
            System.out.println(ginger.getName() + "'s lives remaining: " + ginger.getNumLives());
        }

    } // Emd main
} // End Main