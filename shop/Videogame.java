package com.company;

public class Videogame
{
    private String title,category;
    private double price;
    private static int previousid = -1;
    private int id;



    public Videogame(String title, String category, double price) {
        this.title = title;
        this.category = category;
        this.price = price;
        id = previousid +1;
        previousid += 1;
    }
    public String getTitle()
    {
        return title;
    }

    public String getCategory()
    {
        return category;
    }

    public double getPrice()

    {
        return price;
    }
    public int getId(){return id;}
}
