package Demo2_Fruit.test;

import Demo2_Fruit.java.Citrus;
import Demo2_Fruit.java.Fruit;
import Demo2_Fruit.java.Methods;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.*;

import static org.testng.AssertJUnit.assertEquals;

public class testFruit {
    //data for testing
//    @BeforeMethod
//    public static ArrayList<Fruit> getFruits() {
//        ArrayList<Fruit> fruits = new ArrayList<>();
//        fruits.add(new Fruit("avocado", "green"));
//        fruits.add(new Fruit("apple", "red"));
//        fruits.add(new Fruit("blueberries", "blue"));
//        fruits.add(new Fruit("cherries", "red"));
//        fruits.add(new Fruit("coconut", "brown"));
//        fruits.add(new Fruit("grapefruit", "orange"));
//        fruits.add(new Fruit("guava", "green"));
//        fruits.add(new Citrus("lemon", "yellow", 123));
//        fruits.add(new Fruit("kiwifruit", "brown"));
//        fruits.add(new Citrus("lime", "green", 278));
//        fruits.add(new Fruit("pomegranate", "red"));
//        return fruits;
//    }
//-------------------------------------------------------------------
//    @DataProvider(name = "colorTest")
//    public static Object[][] compareByColorTest() {
//        ArrayList<Fruit> expectedGreen = new ArrayList<>();
//        expectedGreen.add(new Fruit("avocado", "green"));
//        expectedGreen.add(new Fruit("guava", "green"));
//        expectedGreen.add(new Citrus("lime", "green", 278));
//
//        ArrayList<Fruit> expectedRed = new ArrayList<>();
//        expectedRed.add(new Fruit("apple", "red"));
//        expectedRed.add(new Fruit("cherries", "red"));
//        expectedRed.add(new Fruit("pomegranate", "red"));
//
//        ArrayList<Fruit> expectedBrown = new ArrayList<>();
//        expectedBrown.add(new Fruit("coconut", "brown"));
//        expectedBrown.add(new Fruit("kiwifruit", "brown"));
//
//        ArrayList<Fruit> expectedOrange = new ArrayList<>();
//        expectedOrange.add(new Fruit("grapefruit", "orange"));
//
//        return new Object[][]{
//                {expectedGreen, "green"},
//                {expectedRed, "red"},
//                {expectedBrown, "brown"},
//                {expectedOrange, "orange"}
//
//        };
//    }
//
//    @Test(dataProvider = "colorTest")
//    public void compareColorTest(ArrayList<Fruit> expected, String color) {
//        ArrayList<Fruit> fruits = getFruits();
//        System.out.println("Color = " + color + ", Expected list of color" + expected);
//        assertEquals(expected, Methods.filterByColor(fruits, color));
//    }

    @Test
    public void sortByNameTest() {
        //Arrange
        ArrayList<String> expectedName = new ArrayList<>();
        ArrayList<String> actualName = new ArrayList<>();

        ArrayList<Fruit> fruitlist = new ArrayList<>();
        fruitlist.add(new Fruit("cherries","red"));
        fruitlist.add(new Fruit("avocado", "green"));
        fruitlist.add(new Fruit("blueberries", "blue"));
        fruitlist.add(new Fruit("apple", "red"));

        ArrayList<Fruit> expected = new ArrayList<>();
        expected.add(new Fruit("apple", "red"));
        expected.add(new Fruit("avocado", "green"));
        expected.add(new Fruit("blueberries", "blue"));
        expected.add(new Fruit("cherries", "red"));
        //Actual
        ArrayList<Fruit> actual = Methods.sortFruitByName(fruitlist);


        for (Fruit f : expected) {
            expectedName.add(f.getName());
        }
        for (Fruit f : actual) {
            actualName.add(f.getName());
        }

        //Assert
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void filterByColorTest() {
        ArrayList<String> expectedColor = new ArrayList<>();
        ArrayList<String> actualColor = new ArrayList<>();

        ArrayList<Fruit> fruitlist = new ArrayList<Fruit>();
        fruitlist.add(new Fruit("cherries","red"));
        fruitlist.add(new Fruit("avocado", "green"));
        fruitlist.add(new Fruit("blueberries", "blue"));
        fruitlist.add(new Fruit("apple", "red"));

        ArrayList<Fruit> expected = new ArrayList<Fruit>();
        expected.add(new Fruit("apple","red"));
        expected.add(new Fruit("cherries","red"));

        ArrayList<Fruit> actual = Methods.filterByColor(fruitlist,"red");

        for (Fruit f : expected) {
            expectedColor.add(f.getColor());
        }
        for (Fruit f : actual) {
            actualColor.add(f.getColor());
        }

        //Assert
        Assert.assertEquals(expectedColor, actualColor);

//expected.equals(actual);// another method how to compare two ArrayList
    }
    // test if fruit list is saving to xml doc
//    @Test
//    public void serializationTest() {
//        //Arrange
//        ArrayList<Fruit> expected = new ArrayList<>();
//        expected.add(new Fruit("apple", "red"));
//        expected.add(new Fruit("avocado", "green"));
//        expected.add(new Fruit("blueberries", "blue"));
//        expected.add(new Fruit("cherries", "red"));
//
//        //Actual
//        Methods.serialization(expected);
//        ArrayList<Fruit> actual = new ArrayList<>();
//        actual.addAll(Methods.deserialization());
//
//        //Assert
//        assertEquals(expected,actual);
//    }

    @Test
    public void inputTest() {
        Fruit actual = new Fruit();
        Fruit expected = new Fruit("apple","red");
        actual.setName("apple");
        actual.setColor("red");
        Assert.assertEquals(actual.getName(),expected.getName());
        Assert.assertEquals(actual.getColor(),expected.getColor());
    }

}

