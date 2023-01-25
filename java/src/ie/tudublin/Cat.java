package ie.tudublin;

public class Cat {
    String name;
    private int numLives = 9;

    public Cat(String name) {
        this.name = name;
    }

    public void kill() {
        numLives = numLives - 1;
    }

    public int getNumLives() {
        return this.numLives;
    }
}
