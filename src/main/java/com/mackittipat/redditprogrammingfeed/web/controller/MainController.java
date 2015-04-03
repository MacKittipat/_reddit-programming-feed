package com.mackittipat.redditprogrammingfeed.web.controller;

import com.mackittipat.redditprogrammingfeed.service.reddit.model.reddit.RedditFeedDataChildrenModel;
import com.mackittipat.redditprogrammingfeed.service.reddit.RedditFeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private RedditFeedService redditFeedService;

    @RequestMapping("/")
    public String index(Model model) {
        List<RedditFeedDataChildrenModel> redditFeedDataChildrenModelList = redditFeedService.fetchData();
        model.addAttribute("redditFeedDataChildrenModelList", redditFeedDataChildrenModelList);
        return "index";
    }
}
