package com.backend.backend.article;

import javax.persistence.*;

@Entity
@Table
public class Article {
    @Id
    @SequenceGenerator(
            name = "article_sequence",
            sequenceName = "article_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "article_sequence"
    )
    private long id;
    private String artist;
    private String name;
    private int stock;
    private double price;
    private char category;

    public Article() {
    }

    public Article(long id,
                   String artist,
                   String name,
                   int stock,
                   double price,
                   char category) {
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.category = category;
    }

    public Article(String artist,
                   String name,
                   int stock,
                   double price,
                   char category) {
        this.artist = artist;
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(byte stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", artist='" + artist + '\'' +
                ", name='" + name + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
