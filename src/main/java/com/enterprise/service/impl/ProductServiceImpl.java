package com.enterprise.service.impl;

import com.enterprise.dao.ProductDao;
import com.enterprise.dao.ServersManage;
import com.enterprise.entity.Product;
import com.enterprise.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("productService")
public class ProductServiceImpl extends ServersManage<Product, ProductDao> implements ProductService {


    @Override
    @Resource(name = "productDao")
    public void setDao(ProductDao dao) {
        this.dao = dao;
    }


    @Override
    public List<Product> selectByCategoryId(Integer categoryId) {
        return this.dao.selectByCategoryId(categoryId);
    }
}
