package com.enterprise.entity;

import com.enterprise.entity.page.PageModel;

import java.io.Serializable;
import java.util.Date;

/**
 * 产品实体类
 */
public class Product extends PageModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private String title;       //产品标题
    private String modelNo;  //产品型号
    private Integer categoryId;     //产品分类
    private String externalDim;    //产品外形尺寸
    private String externalE;
    private String internalDim;  //产品内径尺寸
    private String internalE;
    private String weight;         //重量
    private String weightE;
    private String volumn;       //体积
    private String volumnE;
    private String sku;          //库存
    private String keywords;      //兴趣链接
    private String tags;    //产品标签

    private String image; //主图
    private String image1; //缩略图1
    private String image2;
    private String image3;
    private String image4;
    private String status;//产品是否上线
    private Date createTime; //创建时间
    private Date updateTime; //更新时间

    private String catename;    //分类名


    @Override
    public void clean() {
        super.clean();
        title = null;
        modelNo = null;
        categoryId = null;
        externalDim = null;
        externalE = null;
        internalDim = null;
        internalE = null;
        weight = null;
        weightE = null;
        volumn = null;
        volumnE = null;
        sku = null;
        keywords = null;
        image = null;
        image1= null;
        image2 =null;
        image3 = null;
        image4 = null;
        tags = null;
        status = null;
        createTime = null;
        updateTime = null;
        catename = null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getExternalDim() {
        return externalDim;
    }

    public void setExternalDim(String externalDim) {
        this.externalDim = externalDim;
    }

    public String getInternalDim() {
        return internalDim;
    }

    public void setInternalDim(String internalDim) {
        this.internalDim = internalDim;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getVolumn() {
        return volumn;
    }

    public void setVolumn(String volumn) {
        this.volumn = volumn;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


    public String getExternalE() {
        return externalE;
    }

    public void setExternalE(String externalE) {
        this.externalE = externalE;
    }

    public String getInternalE() {
        return internalE;
    }

    public void setInternalE(String internalE) {
        this.internalE = internalE;
    }

    public String getWeightE() {
        return weightE;
    }

    public void setWeightE(String weightE) {
        this.weightE = weightE;
    }

    public String getVolumnE() {
        return volumnE;
    }

    public void setVolumnE(String volumnE) {
        this.volumnE = volumnE;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getImage4() {
        return image4;
    }

    public void setImage4(String image4) {
        this.image4 = image4;
    }

    public String getCatename() {
        return catename;
    }

    public void setCatename(String catename) {
        this.catename = catename;
    }
}
