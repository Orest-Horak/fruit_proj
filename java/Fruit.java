package Demo2_Fruit.java;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;

//implement interface serializable
public class Fruit implements Serializable {
    private String name;
    private String color;
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));//read from console

    //get values and set values of class Fruit (fields are private , so we must use getters and setters)
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

    //constructor with parameters
    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    //constructor without parameters
    public Fruit() {
    }

    ;

    //output all (use this , as we have private fields so that we can get all our references to th obj in our class)
    public void output() {
        System.out.print(this);
    }

    @Override
    public String toString() {
        return "\n Fruit name: " + getName() + "| \tfruit color: " + getColor()+"\n";

    }

    //input new fruit
    public void input() {
        try {
            System.out.println("Enter the name of fruit ");
            name = bf.readLine();
            System.out.println("Enter the color of fruit ");
            color = bf.readLine();
            System.out.println("New fruit has been added successfully\n");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }


}
