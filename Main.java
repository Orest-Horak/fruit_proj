package Demo2_Fruit;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Fruit> fruitsList = new ArrayList<>();
        Fruit fruit = new Fruit();
        Fruit citrus = new Citrus();
        fruitsList.add(new Fruit("Apple", "Green"));
        fruitsList.add(new Fruit("Pineapple", "yellow"));
        fruitsList.add(new Fruit("pear", "Orange"));
        fruitsList.add(new Fruit("Banan", "yellow"));
        fruitsList.add(new Fruit("pear", "Orange"));
    }
}