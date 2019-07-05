package Demo2_Fruit.java;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Methods {
    //serialization-deserialization for list of fruits
    //serialization(input)
    public static  void serialization(ArrayList<Fruit> fruits) {
        try {
            FileOutputStream fos = new FileOutputStream("fruit.xml");
            XMLEncoder encoder = new XMLEncoder(fos);
            encoder.writeObject(fruits);
            encoder.close();
            fos.close();
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }

    //deserialization(output)
    public static void deserialization() {
        try (XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream("fruit.xml"))) {
            ArrayList<Fruit> fruits = (ArrayList<Fruit>) xmlDecoder.readObject();
            System.out.printf(fruits.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    //for sorted list serialization-deserialization
    //override methods for sorted list
    public static void serialization(ArrayList<Fruit> fruits, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            XMLEncoder encoder = new XMLEncoder(fos);
            encoder.writeObject(fruits);
            encoder.close();
            fos.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void deserialization(String path) {
        try (XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream(path))) {
            ArrayList<Fruit> fruits = (ArrayList<Fruit>) xmlDecoder.readObject();
            System.out.printf(fruits.toString());
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }

    //------------------------------------------------------------------------------------
    public static ArrayList<Fruit> compareByColor(ArrayList<Fruit> fruits, String color) {
        ArrayList<Fruit> newFruitsList = new ArrayList();
        for (Fruit fruit : fruits) {
            if (fruit.getColor().equals(color)) {
                newFruitsList.add(fruit);
            }
        }
        return newFruitsList;
    }

    public static ArrayList<Fruit> sortFruitByName(ArrayList<Fruit> fruits) {
        Collections.sort(fruits, new SortFruit());
        return fruits;
    }
}
