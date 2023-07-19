package com.enterprise.dao.impl;

import com.enterprise.dao.BaseDao;
import com.enterprise.entity.ProductCategory;
import com.enterprise.entity.page.PageModel;
import com.enterprise.dao.ProductCategoryDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Cesiumai on 2016/6/14.
 */
@Repository("productCategoryDao")
public class ProductCategoryDaoImpl implements ProductCategoryDao {
    @Resource
    private BaseDao dao;

    public void setDao(BaseDao dao) {
        this.dao = dao;
    }

    @Override
    public int insert(ProductCategory articleCategory) {
        return dao.insert("productcategory.insert", articleCategory);
    }

    @Override
    public int delete(ProductCategory articleCategory) {
        return dao.delete("productcategory.delete", articleCategory);
    }

    @Override
    public int update(ProductCategory articleCategory) {
        return dao.update("productcategory.update", articleCategory);
    }

    @Override
    public ProductCategory selectOne(ProductCategory articleCategory) {
        return (ProductCategory) dao.selectOne("productcategory.selectOne", articleCategory);
    }

    @Override
    public PageModel selectPageList(ProductCategory articleCategory) {
        return dao.selectPageList("productcategory.selectPageList", "productcategory.selectPageCount", articleCategory);
    }

    @Override
    public List<ProductCategory> selectList(ProductCategory articleCategory) {
        return dao.selectList("productcategory.selectList", articleCategory);
    }

    @Override
    public int deleteById(int id) {
        return dao.delete("productcategory.deleteById", id);
    }

    @Override
    public ProductCategory selectById(int id) {
        return (ProductCategory) dao.selectOne("productcategory.selectById", id);
    }
}
