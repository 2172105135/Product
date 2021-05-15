package za.ac.cput.za.ac.cput;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetTest {


    Set<Integer> barcode = new HashSet<Integer>();

    @Test
    void setAddTest() {
        barcode.add(1234);
        barcode.add(5678);
        barcode.add(9101);

        System.out.println(barcode);

    }

    @Test
    void setRemoveTest() {

        barcode.add(1234);
        barcode.add(5678);
        barcode.add(9101);


        barcode.remove(9101);

        System.out.println(barcode);

    }
    @Test
    public void SetFind(){

        barcode.add(1234);
        barcode.add(5678);
        barcode.add(9101);
        System.out.println("The barcodes: "+barcode);

        int find =5678;
        System.out.println("The list contains :" + find+" "+barcode.contains(find));
    }




    }


