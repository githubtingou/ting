package com.java.ting.common.page;

import com.github.pagehelper.PageInfo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ObjectUtils;

import java.util.List;

/**
 * 分页入参
 *
 * @author LISHUANG
 * @date 2020/1/3
 */
@Getter
@Setter
public class PageInfoDto {

    /**
     * 总数
     */
    private long total;

    /**
     * 返回的数据
     */
    private List rows;

    /**
     * 返回的条数总量
     */
    private int count;


    public PageInfoDto() {

    }

    /**
     * 封装返参数据
     *
     * @param rows  返回的数据
     * @param total 总数
     */
    public PageInfoDto(List<Object> rows, int total) {
        this.total = total;
        this.rows = rows;
        this.count = ObjectUtils.isEmpty(rows) ? 0 : rows.size();
    }

    /**
     * 根据PageHelper属性分页
     *
     * @param pageInfo {@link com.github.pagehelper.PageInfo} PageHelper封装的pageInfo
     */
    public PageInfoDto(PageInfo pageInfo) {
        this.total = pageInfo.getTotal();
        this.count = pageInfo.getSize();
        this.rows = pageInfo.getList();
    }
}
