package Demo2_Fruit;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;

public class Fruit implements Serializable {
    private String name;
    private String color;
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Fruit() {
    }

    ;

    public String output(Fruit fruits) {
        return fruits.toString();
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void input() throws IOException {
        System.out.println("Enter the name of fruit ");
        name = bf.readLine();
        System.out.println("Enter the color of fruit ");
        color = bf.readLine();
        System.out.println("New fruit has been added successfully");


    }
//serialization
    public void input(ArrayList arrayList) throws IOException {
        FileOutputStream fos = new FileOutputStream("fruits.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.writeObject(arrayList);
        encoder.close();
        fos.close();
    }
//deserialization
    public void output() {
        try (XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream("fruits.xml"))) {
            ArrayList<Fruit> arrayList = (ArrayList<Fruit>) xmlDecoder.readObject();
            System.out.printf(arrayList.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
