package com.example.imageservice.Entity;

public class Image {

    public Image(int id, String tittle, String url) {
        this.id = id;
        this.tittle = tittle;
        this.url = url;
    }
    private int id;
    private String tittle;
    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
