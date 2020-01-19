package com.java.ting.mapper;

import com.java.ting.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    /**
     * 根据教师名称获取信息
     *
     * @param teacherId 教师id
     * @return 学生信息
     */
    List<Student> findStudentByTeacherId(@Param(value = "teacherId") Integer teacherId);
}