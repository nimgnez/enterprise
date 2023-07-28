package com.enterprise.controller.manage;

import com.enterprise.controller.BaseController;
import com.enterprise.entity.ProductInquiry;
import com.enterprise.service.ProductInquiryService;
import com.enterprise.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 产品询价Action
 * Created by Cesiumai on 2016/6/14.
 */
@Controller
@RequestMapping("/manage/inquiry")
public class ProductInquiryAction extends BaseController<ProductInquiry> {
    private static final String page_toList = "/manage/productInquiry/productInquiryList";
    private static final String page_toEdit = "/manage/productInquiry/productInquiryEdit";
    private static final String page_toAdd = "/manage/productInquiry/productInquiryEdit";
    @Autowired
    private ProductInquiryService  productInquiryService;

    @Override
    public Services<ProductInquiry> getService() {
        return productInquiryService;
    }

    private ProductInquiryAction() {
        super.page_toList = page_toList;
        super.page_toEdit = page_toEdit;
        super.page_toAdd = page_toAdd;
    }


}
