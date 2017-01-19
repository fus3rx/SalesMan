package com.imaginers.tonmo.salesman.customer;

import java.io.Serializable;

/**
 * Created by Enayet on 1/19/2017.
 */

public class CustomerDetails implements Serializable {
    private int     customerImage;
    private String  customerFullName;
    private String  customerMobile;
    private String  customerShopName;
    private String  customerShopAddress;
    private String  customerShopID;

    public CustomerDetails(int customerImage, String customerFullName, String customerMobile,
                           String customerShopName, String customerShopAddress, String customerShopID) {
        this.customerImage = customerImage;
        this.customerFullName = customerFullName;
        this.customerMobile = customerMobile;
        this.customerShopName = customerShopName;
        this.customerShopAddress = customerShopAddress;
        this.customerShopID = customerShopID;
    }

    public int getCustomerImage() {
        return customerImage;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public String getCustomerShopName() {
        return customerShopName;
    }

    public String getCustomerShopAddress() {
        return customerShopAddress;
    }

    public String getCustomerShopID() {
        return customerShopID;
    }
}
