package com.enterprise.dao.impl;

import com.enterprise.dao.BaseDao;
import com.enterprise.dao.ProductDao;
import com.enterprise.entity.Product;
import com.enterprise.entity.page.PageModel;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Cesiumai on 2016/6/14.
 */
@Repository("productDao")
public class ProductDaoImpl implements ProductDao {
    @Resource
    private BaseDao dao;

    public void setDao(BaseDao dao) {
        this.dao = dao;
    }

    @Override
    public int insert(Product product) {
        return dao.insert("product.insert", product);
    }

    @Override
    public int delete(Product product) {
        return dao.delete("product.delete", product);
    }

    @Override
    public int update(Product product) {
        return dao.update("product.update", product);
    }

    @Override
    public Product selectOne(Product product) {
        return (Product) dao.selectOne("product.selectOne", product);
    }

    @Override
    public PageModel selectPageList(Product product) {
        return dao.selectPageList("product.selectPageList", "product.selectPageCount", product);
    }

    @Override
    public List<Product> selectList(Product product) {
        return dao.selectList("product.selectList", product);
    }

    @Override
    public int deleteById(int id) {
        return dao.delete("product.deleteById", id);
    }

    @Override
    public Product selectById(int id) {
        return (Product) dao.selectOne("product.selectById", id);
    }


}
