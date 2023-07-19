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
    private String internalDim;  //产品内径尺寸
    private String weight;         //重量
    private String volumn;       //体积
    private String sku;          //库存
    private String interestetLink;      //兴趣链接
    private String tags;    //产品标签
    private String status;//产品是否上线
    private Date createTime; //创建时间
    private Date updateTime; //更新时间

    @Override
    public void clean() {
        super.clean();
        title = null;
        modelNo = null;
        categoryId = null;
        externalDim = null;
        internalDim = null;
        weight = null;
        volumn = null;
        sku = null;
        interestetLink = null;
        tags = null;
        status = null;
        createTime = null;
        updateTime = null;
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

    public String getInterestetLink() {
        return interestetLink;
    }

    public void setInterestetLink(String interestetLink) {
        this.interestetLink = interestetLink;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
