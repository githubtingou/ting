package com.java.ting.controller.web;

import com.alibaba.fastjson.JSON;
import com.java.ting.dto.jilian.TeacherDto;
import com.java.ting.mapper.TeacherMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 级联测试类
 *
 * @author LISHUANG
 * @date 2020/1/14
 */
@RestController
@RequestMapping(value = "/web")
@Slf4j
@Api
public class JiLianController {

    @Autowired
    private TeacherMapper teacherMapper;

    /**
     * mybatis级联测试-collection使用select标签
     * <p>和数据库的交互次数 1+n 数据量越大效率越慢<pre>1：代表查询教师表的次数；</pre><pre>n：代表查询学生表的次数</pre></p>
     * @return List<TeacherDto> 教师和学生关联数据
     */
    @ApiOperation(value = "mybatis级联测试-collection使用select", notes = "Mybatis")
    @PostMapping(value = "/jilian/collection/select")
    public List<TeacherDto> getCollectionSelect() {
        List<TeacherDto> list = teacherMapper.findTeacherAndStudentById();
        log.info("展示数据级联--{}", JSON.toJSON(list));
        return list;
    }

    /**
     * mybatis级联测试-collection使用左连接
     *<p>直接使用sql进行查询，只和数据库交互一次,比{@link TeacherMapper#findTeacherAndStudentById}方法用时更少</p>
     *
     * @return  List<TeacherDto> 教师和学生关联数据
     */
    @ApiOperation(value = "mybatis级联测试-collection使用左连接", notes = "Mybatis")
    @PostMapping(value = "/jilian/leftJoin")
    public List<TeacherDto> getLeftJoin() {
        List<TeacherDto> list = teacherMapper.findTeacherAndStudentByIdLeftJoin();
        log.info("展示数据-----{}", JSON.toJSON(list));
        return list;
    }


}
