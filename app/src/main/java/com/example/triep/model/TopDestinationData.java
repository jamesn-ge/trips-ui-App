package com.example.triep.model;

public class TopDestinationData {

    private String placeName;
    private String countryName;
    private String price;
    private int imageFile;

    public TopDestinationData() {
    }

    public TopDestinationData(String placeName, String countryName, String price, int imageFile) {
        this.placeName = placeName;
        this.countryName = countryName;
        this.price = price;
        this.imageFile = imageFile;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImageFile() {
        return imageFile;
    }

    public void setImageFile(int imageFile) {
        this.imageFile = imageFile;
    }
}
