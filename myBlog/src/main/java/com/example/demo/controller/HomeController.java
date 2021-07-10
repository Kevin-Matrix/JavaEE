
//package com.example.demo.controller;
//
//import org.springframework.stereotype.Controller;
//
//import javax.annotation.Resource;
//
//@Controller
//public class HomeController {
//@Resource
//    private
//
//}

package com.example.demo.controller;

import com.example.demo.entity.blogInfo;
import com.example.demo.service.HomeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class HomeController {

    @Resource
    private HomeService homeService;

    public String getBlogs(Model model){
        model.addAttribute("blogList", homeService.getBlogs());
        return "home-test";
    }

    @RequestMapping(value = "/{tagId}")     //点击标签后查询对应标签的博客
    public String tagToBlogs(@PathVariable("tagId") String tagId, Model model){
        model.addAttribute("blogListFilteredByTag", homeService.tagToBlogs(tagId));
        return "tag";
    }

    @RequestMapping("/search")
    public String searchBlogs(@RequestBody String keyword, Model model) {
        model.addAttribute("blogListFilteredByKeyword", homeService.searchBlogs(keyword));
        return "search";
    }
}