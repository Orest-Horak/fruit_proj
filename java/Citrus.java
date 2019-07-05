package Demo2_Fruit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public class Citrus extends Fruit implements Serializable {
    private double VitaminC;

    public Citrus() {
    }

    //constructor with parameters including fields of parent class(use super to get this fields)
    public Citrus(String name, String color, double vitaminC) {
        super(name, color);
        VitaminC = vitaminC;
    }

    public double getVitaminC() {
        return VitaminC;
    }

    public void setVitaminC(double vitaminC) {
        VitaminC = vitaminC;
    }
//method input  from parent class modification
    @Override
    public void input() {
        try {
            System.out.println("Citrus: \n");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            super.input();
            System.out.println("Enter vitamin C for citrus: ");
            setVitaminC(Double.parseDouble((br.readLine())));
            System.out.println("New citrus fruit has been added successfully ");
            System.out.println("----------------------------------------------\n");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public void output() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "\n Fruit name: " + getName() + "| \tfruit color: " + getColor() + "| \tvitamin C: " + getVitaminC() + "Gr\n";
    }
}
