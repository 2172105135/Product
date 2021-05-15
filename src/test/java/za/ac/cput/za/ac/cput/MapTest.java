package za.ac.cput.za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
   Map category = new HashMap();

    @Test
    void MapAdd(){
        category.put("index 1","Hair products");
        category.put("index 2", "Facials");
        category.put("index 3", "Medication");
        System.out.println(category);
    }

    @Test
    void MapRemove(){
        category.put("index 1","Hair products");
        category.put("index 2", "Facials");
        category.put("index 3", "Medication");

        category.remove("index 2", "Facials");

        System.out.println(category);

    }

    @Test
    void MapFind(){
        category.put("index 1","Hair products");
        category.put("index 2", "Facials");
        category.put("index 3", "Medication");

        System.out.println(category);

        String medication = (String) category.get("index 3");

        System.out.println("The category does contains :" + medication+" "+medication.contains(medication));

    }

}
