package com.java.ting.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * teacher
 *
 * @author tingOu
 */
@Getter
@Setter
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 教师名称
     */
    private String name;


}