package com.example.demo.mapper;

import com.example.demo.entity.student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface studentMapper {
    List<student> findAll();
}
