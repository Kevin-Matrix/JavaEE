package com.example.demo.service.impl;

import com.example.demo.entity.BlogInfo;
import com.example.demo.mapper.BlogMapper;
import com.example.demo.service.BlogService;
import com.example.demo.utils.GetTime;
import com.example.demo.utils.TagMap;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Component
@Service("BlogService")
public class BlogServiceImpl implements BlogService {

    @Resource
    private BlogMapper blogMapper;

    @Override
    public BlogInfo getBlog(int blogId) {
        return blogMapper.getBlog(blogId);
    }

    @Override
    public String like(int blogId) {
        blogMapper.like(blogId);
        return "点赞成功";
    }

    @Override
    public void cancelLike(int blogId) {
        blogMapper.cancelLike(blogId);
    }

    @Override
    public String comment(int blogId, int userId, String comment) {
        GetTime getTime = new GetTime();
        System.out.println(getTime.getCurrentTime());
        blogMapper.comment(blogId, userId, getTime.getCurrentTime(), comment);
        return "评论成功";
    }

    @Override
    public String forward(int blogId, int userId) {
        GetTime getTime = new GetTime();
        blogMapper.forward(blogId, userId, getTime.getCurrentTime());
        return "转发成功";
    }

    @Override
    public String collect(int blogId, int userId) {
        GetTime getTime = new GetTime();
        blogMapper.collect(blogId, userId, getTime.getCurrentTime());
        return "收藏成功";
    }

    @Override
    public void updateMarkWhenLike(int tagId, int userId) {
        TagMap map = new TagMap();
        blogMapper.updateMarkWhenLike(map.getTagName(tagId), userId);
    }

    @Override
    public void updateMarkWhenCancelLike(int tagId, int userId) {
        TagMap map = new TagMap();
        blogMapper.updateMarkWhenCancelLike(map.getTagName(tagId), userId);
    }

    @Override
    public void updateMarkWhenComment(int tagId, int userId) {
        TagMap map = new TagMap();
        blogMapper.updateMarkWhenComment(map.getTagName(tagId), userId);
    }

    @Override
    public void updateMarkWhenForward(int tagId, int userId) {
        TagMap map = new TagMap();
        blogMapper.updateMarkWhenForward(map.getTagName(tagId), userId);
    }

    @Override
    public void updateMarkWhenCollect(int tagId, int userId) {
        TagMap map = new TagMap();
        blogMapper.updateMarkWhenCollect(map.getTagName(tagId), userId);
    }
}
