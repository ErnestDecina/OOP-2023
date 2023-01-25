package ie.tudublin;

public class Cat {
    // Fields
    String name;

    private int numLives = 9;

    public Cat (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getNumLives() {
        return this.numLives;
    }

    public void speak() {
        System.out.println("Meow");
    }

    public void kill () {
        numLives = numLives - 1;
    }
}
