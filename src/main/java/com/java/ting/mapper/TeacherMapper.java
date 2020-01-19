package com.java.ting.mapper;

import com.java.ting.domain.Teacher;
import com.java.ting.dto.jilian.TeacherDto;

import java.util.List;

public interface TeacherMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    List<TeacherDto> findTeacherAndStudentById();

    List<TeacherDto> findTeacherAndStudentByIdLeftJoin();

}