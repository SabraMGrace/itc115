//*******************************************************************
// ITC 115 (Fall 2019)
// productSorter
// 1. The product data should include a product code, description, price and product count. 
// 2. In addition to the getter and setter methods, the class should implement toString and also a formatted output of the price (Hint: use the NumberFormat class. Here is the implementation of your formattedPrice method: 
// Ex: public String getPriceFormatted() 
//    {
//        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
//        return formattedPrice;
//    }
// 3. From the client app create instance of 2-3 different products and use the toString method to display their data.
// Optional: Keep track of the count of the products created and call the getCount method to verify that it is correct. (Where could you keep track of the count of products?)
// By: Sabra Grace
//*******************************************************************

import java.text.NumberFormat;

public class Product {
    String name;
    String description;
    double price;
    int code;
    int count;

    // Construct a new product.
    public Product(String initialName, String initialDescription, double initialPrice, int initialCode, int initialCount) {
        name = initialName;
        description = initialDescription;
        price = initialPrice;
        code = initialCode;
        count = initialCount;
    }
    
    // Create setters.
    public void setName(String newName) {
    	this.name = newName;
    }
    public void setDescription(String newDescription) {
    	this.description = newDescription;
    }
    public void setPrice(double newPrice) {
    	this.price = newPrice;
    }
    public void setCode(int newCode) {
    	this.code = newCode;
    }
    public void setCount(int newCount) {
    	this.count = newCount;
    }
    
    // Create getters.
    public String getName(){
    	return this.name;
    }
    public String getDescription() {
    	return this.description;
    }
    public double getPrice() {
    	return this.price;
    }
    public int getCode() {
    	return this.code;
    }
    public int getCount() {
    	return this.count;
    }
    public String getPriceFormatted() {
    	String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
    	return formattedPrice;
    }
    public String toString() {
    	return " Name: " + name + "\n Description: " + description + "\n Price: " + this.getPriceFormatted() + "\n Code: " + code + "\n Count: " + count;
    }

    public static void main(String args[]){
        Product myProduct = new Product("dog toy", "it's a dog toy", 14.50, 12345, 200);
        Product someOtherProduct = new Product("cat toy", "it's for cats", 99.99, 678, 77);
        // Use setter.
        myProduct.setName("Gift Set");
        System.out.println(myProduct.getName());
        // Use getter.
        System.out.println(myProduct.getPrice());
        // Change price using setter.
        myProduct.setPrice(30.00);
        // Print new price using getter.
        System.out.println(myProduct.getPrice());   
        System.out.println(myProduct.toString());
        System.out.println(someOtherProduct.toString());
    }
}
