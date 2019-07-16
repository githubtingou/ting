package com.java.ting.common;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ObjectUtils;

import java.util.List;

/**
 * 分页条数
 *
 * @author tingOu
 */
@Getter
@Setter
public class PageInfo<T> {
    private int total;
    private List<T> rows;

    PageInfo() {
        super();
    }

    PageInfo(List<T> rows) {
        this.rows = rows;
        this.total = ObjectUtils.isEmpty(rows) ? 0 : rows.size();
    }

    public List<T> setRows(List<T> rows) {
        if (ObjectUtils.isEmpty(rows)) {
            this.total = 0;
        }
        this.total = rows.size();
        return rows;
    }

}
