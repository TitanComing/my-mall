package com.peng.mall.dto;

import com.peng.mall.model.PmsProductCategory;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by peng on 2018/5/25.
 */
public class PmsProductCategoryWithChildrenItem extends PmsProductCategory {
    @ApiModelProperty("子级分类")
    private List<PmsProductCategory> children;

    public List<PmsProductCategory> getChildren() {
        return children;
    }

    public void setChildren(List<PmsProductCategory> children) {
        this.children = children;
    }
}
