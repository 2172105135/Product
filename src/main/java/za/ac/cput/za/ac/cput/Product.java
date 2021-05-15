package za.ac.cput.za.ac.cput;

/*
Author: Khanya Gibisela
Student Number: 217205135
Due date: 16 May 2021
This program involves information about products that needs to be supplied.
 */

import java.util.Objects;

public class Product {
    private int barCode;
    private String productName;
    private String productDescription;
    private String category;
    private double price;

    // constructor
    public Product(int barCode, String productName,String productDescription, String category, double price) {
        this.barCode = barCode;
        this.productName= productName;
        this.productDescription = productDescription;
        this.category = category;
        this.price = price;
    }

    // getters
    public int getBarCode() {
        return barCode;
    }
    public String getProductName(){
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    // setters
    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void set(int barCode,String productName, String productDescription, String category, double price) {
        this.barCode = barCode;
        this.productName = productName;
        this.productDescription = productDescription;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "barCode=" + barCode +
                "productName=" + productName +
                ", productDescription='" + productDescription + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return barCode == product.barCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(barCode);
    }
}
