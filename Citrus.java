package Demo2_Fruit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public class Citrus extends Fruit implements Serializable {
    private double VitaminC;

    public Citrus() {
    }



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
    @Override
    public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter citrus name: ");
        setName(br.readLine());
        System.out.println("Enter citrus color: ");
        setColor(br.readLine());
        System.out.println("Enter vitamin C for citrus: ");
        setVitaminC(Integer.parseInt((br.readLine())));

        System.out.println("new fruit add");

    }

    @Override
    public String output(Fruit citrus) {
        return citrus.toString();
    }

    @Override
    public String toString() {
        return "\nFruit name: " + getName() + "\tfruit color: " + getColor() + "\tvitamin C: " + getVitaminC() + "Gr\n";
    }
}
