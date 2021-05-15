package za.ac.cput.za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

// This test class is assigned to a new branch called 217205135
public class ListTest {
    List<Double> price = new ArrayList();

    @Test
    void listAdd(){
      price.add(20.00);
      price.add(150.00);
      price.add(80.00);

        System.out.println(price);
        price.add(1,70.00);

        System.out.println(price);

    }

    @Test
    void ListRemove(){
        price.add(0,20.00);
        price.add(1,150.00);
        price.add(2,80.00);

        System.out.println(price);
        price.add(1,70.00);

        System.out.println(price);

        price.remove(150.00);

        System.out.println("Removing the index 2 element of the current listing:"  + price);

    }


}
