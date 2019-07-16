package com.java.ting.common;

import lombok.Getter;
import lombok.Setter;

/**
 * 分页Dto
 *
 * @author tingOu
 */
@Setter
@Getter
public class PageDto {

    /**
     * 分页
     */
    private int pageNum;
    /**
     * 分页个数
     */
    private int pageSize;


}
