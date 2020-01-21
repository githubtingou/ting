package com.java.ting.dto.jilian;

import com.java.ting.domain.Student;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 测试级联-一对多
 *
 * @author LISHUANG
 * @date 2020/1/14
 */
@Getter
@Setter
@Accessors(chain = true)
public class TeacherDto {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 教师名称
     */
    private String name;

    /**
     * 学生信息集合
     */
    private List<Student> studentList;

}
