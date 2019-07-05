package Demo2_Fruit.java;

import java.util.Comparator;
//sorting obj by its property
public class SortFruit implements Comparator<Fruit>{

    @Override
    public int compare(Fruit f1, Fruit f2) {
        return f1.getName().compareTo(f2.getName());
       // return f1.getColor().compareTo(f2.getColor());
    }

}
