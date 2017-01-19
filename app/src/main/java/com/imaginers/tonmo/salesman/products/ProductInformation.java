package com.imaginers.tonmo.salesman.products;

/**
 * Created by tonmo on 1/18/2017.
 */

public class ProductInformation {
    private int images;
    private String productName;
    private String productAvailability;

    public ProductInformation(int images, String productName, String productAvailability) {
        this.images = images;
        this.productName = productName;
        this.productAvailability = productAvailability;
    }

    public int getImages() {
        return images;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductAvailability() {
        return productAvailability;
    }
}
