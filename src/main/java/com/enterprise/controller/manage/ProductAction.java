package com.enterprise.controller.manage;

import com.enterprise.controller.BaseController;
import com.enterprise.entity.Article;
import com.enterprise.entity.Product;
import com.enterprise.service.ArticleService;
import com.enterprise.service.ProductService;
import com.enterprise.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 产品管理Action
 */
@Controller
@RequestMapping("/manage/product/")
public class ProductAction extends BaseController<Product>{
    private static final String page_toList = "/manage/product/productList";
    private static final String page_toEdit = "/manage/product/productEdit";
    private static final String page_toAdd = "/manage/product/productEdit";
    @Autowired
    private ProductService productService;
    @Override
    public Services<Product> getService() {
        return productService;
    }
    private ProductAction(){
        super.page_toList = page_toList;
        super.page_toEdit = page_toEdit;
        super.page_toAdd = page_toAdd;
    }


}
