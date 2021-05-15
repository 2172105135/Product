package za.ac.cput.za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

 class CollectionTest {
    Collection productName = new ArrayList<String>();


    @Test
    void CollectionAdd(){
        productName.add("Shampoo");
        productName.add("Conditioner");
        productName.add("Hair Moisture");
        productName.add("Hair Food");


        System.out.println(productName);

    }

     @Test
     void CollectionRemove(){
         productName.add("Shampoo");
         productName.add("Conditioner");
         productName.add("Hair Moisture");
         productName.add("Hair Food");

         productName.remove( "Hair Moisture");

         System.out.println(productName);

     }

     @Test
     void CollectionFind(){

       String product = "Shampoo for Hair";

         System.out.println(product.contains("Shampoo"));

     }
}
