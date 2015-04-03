package com.mackittipat.redditprogrammingfeed.web.controller;

import com.mackittipat.redditprogrammingfeed.persistence.domain.Item;
import com.mackittipat.redditprogrammingfeed.persistence.service.ItemRepository;
import com.mackittipat.redditprogrammingfeed.service.reddit.model.reddit.RedditFeedDataChildrenModel;
import com.mackittipat.redditprogrammingfeed.service.reddit.RedditFeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private RedditFeedService redditFeedService;

    @Autowired
    private ItemRepository itemRepository;

    @RequestMapping("/")
    public String index(Model model) {
        List<RedditFeedDataChildrenModel> redditFeedDataChildrenModelList = redditFeedService.fetchData();
        model.addAttribute("redditFeedDataChildrenModelList", redditFeedDataChildrenModelList);
        return "index";
    }

    @ResponseBody
    @RequestMapping("/save")
    public String save() {
        List<RedditFeedDataChildrenModel> redditFeedDataChildrenModelList = redditFeedService.fetchData();
        for(RedditFeedDataChildrenModel redditFeedDataChildrenModel : redditFeedDataChildrenModelList) {
            Item item = new Item();
            item.setTitle(redditFeedDataChildrenModel.getData().getTitle());
            itemRepository.save(item);
        }
        return "Saved";
    }
}
