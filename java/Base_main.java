package Demo2_Fruit.java;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Base_main {
    public static void main(String[] args) {
        //creating list of fruits
        ArrayList<Fruit> fruitsList = new ArrayList<>();
        Fruit fruit = new Fruit();
        Fruit citrus = new Citrus();
        //fill our list of fruits
        fruitsList.add(new Fruit("Apple", "green"));
        fruitsList.add(new Fruit("Pineapple", "yellow"));
        fruitsList.add(new Fruit("Strawberry", "red"));
        fruitsList.add(new Fruit("Banana", "yellow"));
        fruitsList.add(new Fruit("Pear", "orange"));
        fruitsList.add(new Fruit("Mango", "yellow"));
        fruitsList.add(new Fruit("Melon", "yellow"));
        fruitsList.add(new Fruit("Grape", "purple"));
        fruitsList.add(new Fruit("Cherry", "red"));

        Scanner scan = new Scanner(System.in);//scanner for switch case menu
        while (true) {
            System.out.println("|---------------------Menu--------------------------------------|");
            System.out.println("|   1. Input fruit                                              |");
            System.out.println("|   2. Output fruit                                             |");
            System.out.println("|   3. Add fruits to list                                       |");
            System.out.println("|   4. Print list of fruits                                     |");
            System.out.println("|   5. Show fruits with entered color                           |");
            System.out.println("|   6. Sort fruits by name                                      |");
            System.out.println("|   7. Serialize list of fruits in xml                          |");
            System.out.println("|   8. Deserialize list of fruits from xml                      |");
            System.out.println("|   9. Serialize sorted by name list of fruits in xml           |");
            System.out.println("|   10. Deserialize sorted by name list of fruits from xml      |");
            System.out.println("|   0. Exit                                                     |");
            System.out.println("|---------------------------------------------------------------|");

            int choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    fruit.input();
                    citrus.input();
                    break;
                }
                case 2: {
                    fruit.output();
                    citrus.output();
                    break;
                }
                case 3: {
                    fruitsList.add(fruit);
                    fruitsList.add(citrus);
                    break;
                }
                case 4: {
                    for (Fruit f : fruitsList) {

                        System.out.print(f.toString());
                    }
                    break;
                }
                case 5: {
                    Scanner col = new Scanner(System.in);
                    System.out.println("Enter color");
                    String color = col.next().toLowerCase();
                    List<Fruit> sortedByColor = Methods.compareByColor(fruitsList, color);
                    for (Fruit f : sortedByColor) {
                        f.output();
                    }
                    break;
                }
                case 6: {
                    System.out.println("------------Sorted by name--------------");
                    Methods.sortFruitByName(fruitsList);
                    for (Fruit f : fruitsList) {
                        System.out.print(f.toString());
                    }
                    break;
                }
                case 7: {

                    Methods.serialization(fruitsList);
                    System.out.println("Serialized");
                    break;
                }
                case 8: {
                    Methods.deserialization();
                    System.out.println("Deserialized");
                    break;
                }
                case 9: {
                    //realization if serialization is not static
//                    Methods methods = new Methods();
//                    methods.serialization(fruitsList,"sortedFruit.xml");
                    Methods.serialization(fruitsList, "sortedFruit.xml");
                    System.out.println("Serialized sorted fruit");
                    break;
                }
                case 10: {
                    Methods.deserialization("sortedFruit.xml");
                    System.err.println("Deserialized sorted fruit");
                    break;
                }
                case 0: {
                    System.out.println("Exit");
                    System.exit(0);

                }
                default: {
                    System.out.println("You enter incorrect number");
                }
            }
        }
    }

}
