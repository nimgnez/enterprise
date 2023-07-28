package com.enterprise.service;

import com.enterprise.entity.Product;

import java.util.List;

public interface ProductService extends Services<Product> {


    List<Product> selectByCategoryId(Integer categoryId);

}
