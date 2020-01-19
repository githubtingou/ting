package com.java.ting.common.page;

import lombok.Getter;
import lombok.Setter;

/**
 * 分页返参数据
 *
 * @author LISHUANG
 * @date 2020/1/3
 */
@Getter
@Setter
public class PageModelDto {
    /**
     * 当前页
     */
    private int currentPage;

    /**
     * 分页数量
     */
    private int pageSize;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序判断是否正序还是倒序
     * true :倒序
     * false:正序
     */
    private boolean orderByDesc;

}
