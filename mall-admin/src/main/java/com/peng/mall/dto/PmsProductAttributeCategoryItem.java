package com.peng.mall.dto;

import com.peng.mall.model.PmsProductAttribute;
import com.peng.mall.model.PmsProductAttributeCategory;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * 包含有分类下属性的dto
 * Created by peng on 2018/5/24.
 */
public class PmsProductAttributeCategoryItem extends PmsProductAttributeCategory {
    @ApiModelProperty(value = "商品属性列表")
    private List<PmsProductAttribute> productAttributeList;

    public List<PmsProductAttribute> getProductAttributeList() {
        return productAttributeList;
    }

    public void setProductAttributeList(List<PmsProductAttribute> productAttributeList) {
        this.productAttributeList = productAttributeList;
    }
}
