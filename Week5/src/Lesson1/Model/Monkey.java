package Lesson1.Model;

public class Monkey extends Animal {
    private String favouriteFruit;

    public Monkey() {
    }

    public Monkey(String favouriteFruit) {
        this.favouriteFruit = favouriteFruit;
    }

    public Monkey(int id, String name, int age, String favouriteFruit) {
        super(id, name, age);
        this.favouriteFruit = favouriteFruit;
    }

    public String getFavouriteFruit() {
        return favouriteFruit;
    }

    public void setFavouriteFruit(String favouriteFruit) {
        this.favouriteFruit = favouriteFruit;
    }

    @Override
    public String toString() {
        return super.toString() + "favouriteFruit: " + this.favouriteFruit + "Chit chit";
    }
}
