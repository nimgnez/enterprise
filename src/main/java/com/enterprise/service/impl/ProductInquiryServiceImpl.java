package com.enterprise.service.impl;

import com.enterprise.dao.ProductInquiryDao;
import com.enterprise.dao.ServersManage;
import com.enterprise.entity.ProductInquiry;
import com.enterprise.service.ProductInquiryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("productInquiryService")
public class ProductInquiryServiceImpl extends ServersManage<ProductInquiry, ProductInquiryDao> implements ProductInquiryService {
    @Override
    @Resource(name = "productInquiryDao")
    public void setDao(ProductInquiryDao dao) {
        this.dao = dao;
    }
}
