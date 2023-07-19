package com.enterprise.controller.manage;

import com.enterprise.cache.FrontCache;
import com.enterprise.service.Services;
import com.enterprise.entity.ProductCategory;
import com.enterprise.service.ProductCategoryService;
import com.enterprise.controller.BaseController;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 产品分类Action
 * Created by Cesiumai on 2016/6/14.
 */
@Controller
@RequestMapping("/manage/productCategory/")
public class ProductCategoryAction extends BaseController<ProductCategory> {
    private static final String page_toList = "/manage/productCategory/productCategoryList";
    private static final String page_toEdit = "/manage/productCategory/productCategoryEdit";
    private static final String page_toAdd = "/manage/productCategory/productCategoryEdit";
    @Autowired
    private ProductCategoryService productCategoryService;
    @Autowired
    private FrontCache frontCache;

    @Override
    public Services<ProductCategory> getService() {
        return productCategoryService;
    }

    public ProductCategoryAction() {
        super.page_toList = page_toList;
        super.page_toEdit = page_toEdit;
        super.page_toAdd = page_toAdd;
    }

    @Override
    public String insert(HttpServletRequest request, @ModelAttribute("e") ProductCategory productCategory, RedirectAttributes flushAttrs) throws Exception {
        productCategoryService.insert(productCategory);
        insertAfter(productCategory);
        addMessage(flushAttrs, "操作成功！");
        frontCache.loadArticleCategroy();//加载缓存
        return "redirect:selectList";
    }

    @Override
    public String update(HttpServletRequest request, @ModelAttribute("e") ProductCategory productCategory, RedirectAttributes flushAttrs) throws Exception {
        productCategoryService.update(productCategory);
        insertAfter(productCategory);
        addMessage(flushAttrs, "操作成功！");
        frontCache.loadArticleCategroy();//加载缓存
        return "redirect:selectList";
    }

    @RequestMapping("delete")
    public String delete(HttpServletRequest request, @ModelAttribute("e") ProductCategory productCategory, RedirectAttributes flushAttrs) throws Exception {
        productCategoryService.delete(productCategory);
        insertAfter(productCategory);
        addMessage(flushAttrs, "操作成功！");
        frontCache.loadArticleCategroy();//加载缓存
        return "redirect:selectList";
    }

    @RequestMapping("unique")
    @ResponseBody
    public String unique(@ModelAttribute("e") ProductCategory e, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("utf-8");//设置响应编码为utf-8
        if (StringUtils.isNotBlank(e.getCatename())) {
            ProductCategory articleCategory = new ProductCategory();
            articleCategory.setCatename(e.getCatename());
            articleCategory = productCategoryService.selectOne(articleCategory);

            if (articleCategory == null) {
                return "{}";
            } else {
                if (e.getId() != 0 && e.getId() == articleCategory.getId()) {
                    return "{}";
                } else {
                    return "{\"error\":\"分类名称已经存在!\"}";
                }
            }
        } else if (StringUtils.isNotBlank(e.getCode())) {
            ProductCategory articleCategory = new ProductCategory();
            articleCategory.setCode(e.getCode());
            articleCategory = productCategoryService.selectOne(articleCategory);
            if (articleCategory == null) {
                return "{}";
            } else {
                if (e.getId() != 0 && e.getId() == articleCategory.getId()) {
                    return "{}";
                } else {
                    return "{\"error\":\"编码已经存在!\"}";
                }
            }
        }
        return null;
    }
}
