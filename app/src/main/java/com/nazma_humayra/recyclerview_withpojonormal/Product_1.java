package com.nazma_humayra.recyclerview_withpojonormal;

public class Product_1 {



    private int id;
    private String title;
    private String shortdesc;
    private double rating;
    private double price;
    private int image;
     private String name;



    public Product_1(int id, String name, String title, String shortdesc, double rating, double price, int image) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.rating = rating;
        this.price = price;
        this.image = image;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }
    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }

}