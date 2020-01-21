package com.java.ting.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * student
 * @author 
 */
@Getter
@Setter
@Accessors(chain = true)
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 学生名称
     */
    private String studentName;

    /**
     * 教师id
     */
    private Integer teacherId;


}