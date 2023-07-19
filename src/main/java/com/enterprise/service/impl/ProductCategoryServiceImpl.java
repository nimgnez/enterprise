package com.enterprise.service.impl;

import com.enterprise.dao.ProductCategoryDao;
import com.enterprise.dao.ServersManage;
import com.enterprise.entity.ProductCategory;
import com.enterprise.service.ProductCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Cesiumai on 2016/6/14.
 */
@Service("productCategoryService")
public class ProductCategoryServiceImpl extends ServersManage<ProductCategory, ProductCategoryDao> implements ProductCategoryService {
    @Override
    @Resource(name = "productCategoryDao")
    public void setDao(ProductCategoryDao dao) {
        this.dao = dao;
    }
}