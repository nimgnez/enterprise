package com.enterprise.dao;


import com.enterprise.entity.Product;

import java.util.List;

/**
 * Created by Cesiumai on 2016/6/14.
 */
public interface ProductDao extends DaoManage<Product> {

    List<Product> selectByCategoryId(Integer categoryId);

}
