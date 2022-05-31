package com.example.grocerystoreproject;

public class productAdd {

    String Name;
    String Id;
    String Price;
    String Quantity;
    String Stock;

    public productAdd() {
    }

    public productAdd(String name, String id, String price, String quantity, String stock, String imageUrl) {
        Name = name;
        Id = id;
        Price = price;
        Quantity = quantity;
        Stock = stock;
        ImageUrl = imageUrl;
    }

    String ImageUrl;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public String getStock() {
        return Stock;
    }

    public void setStock(String stock) {
        Stock = stock;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }
}
