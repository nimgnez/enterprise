package com.enterprise.entity;

import com.enterprise.entity.page.PageModel;

import java.io.Serializable;
import java.util.Date;

public class ProductInquiry extends PageModel implements Serializable {

    private String ProductModel;

    private String Quantity;

    private String name;
    private String email;
    private String message;

    private Date createTime;


    public String getProductModel() {
        return ProductModel;
    }

    public void setProductModel(String productModel) {
        ProductModel = productModel;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
