package com.example.demo.service.impl;

import com.example.demo.entity.Blog;
import com.example.demo.entity.User;
import com.example.demo.entity.blogInfo;
import com.example.demo.mapper.HomeMapper;
import com.example.demo.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("HomeService")
public class HomeServiceImpl implements HomeService {

    @Resource
    private HomeMapper homeMapper;

    @Override
    public List<blogInfo> getBlogs() {
        return homeMapper.getBlogs();
    }

    @Override
    public List<blogInfo> changeCategory(Integer category) {
        return homeMapper.changeCategory(category);
    }

    @Override
    public List<blogInfo> searchBlogs(String keyword) {
        return homeMapper.searchBlogs(keyword);
    }

    @Override
    public List<User> recommendUsers(String username){
        return homeMapper.recommendUsers(username);
    }
}
