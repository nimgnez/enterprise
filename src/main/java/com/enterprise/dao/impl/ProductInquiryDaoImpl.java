package com.enterprise.dao.impl;

import com.enterprise.dao.BaseDao;
import com.enterprise.dao.ProductInquiryDao;
import com.enterprise.entity.ProductInquiry;
import com.enterprise.entity.page.PageModel;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
@Repository("productInquiryDao")
public class ProductInquiryDaoImpl implements ProductInquiryDao {


    @Resource
    private BaseDao dao;

    public void setDao(BaseDao dao) {
        this.dao = dao;
    }

    @Override
    public int insert(ProductInquiry productInquiry) {
        return dao.insert("productInquiry.insert", productInquiry);
    }

    @Override
    public int delete(ProductInquiry productInquiry) {
        return dao.delete("productInquiry.delete", productInquiry);
    }

    @Override
    public int update(ProductInquiry productInquiry) {
        return dao.update("productInquiry.update", productInquiry);
    }

    @Override
    public ProductInquiry selectOne(ProductInquiry productInquiry) {
        return (ProductInquiry) dao.selectOne("productInquiry.selectOne", productInquiry);
    }

    @Override
    public PageModel selectPageList(ProductInquiry productInquiry) {
        return dao.selectPageList("productInquiry.selectPageList", "productInquiry.selectPageCount", productInquiry);
    }

    @Override
    public List<ProductInquiry> selectList(ProductInquiry productInquiry) {
        return dao.selectList("productInquiry.selectList", productInquiry);
    }

    @Override
    public int deleteById(int id) {
        return dao.delete("productInquiry.deleteById", id);
    }

    @Override
    public ProductInquiry selectById(int id) {
        return (ProductInquiry) dao.selectOne("ProductInquiry.selectById", id);
    }
}
