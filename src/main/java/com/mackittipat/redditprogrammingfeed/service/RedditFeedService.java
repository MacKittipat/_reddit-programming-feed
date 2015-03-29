package com.mackittipat.redditprogrammingfeed.service;

import com.mackittipat.redditprogrammingfeed.model.reddit.RedditFeedDataChildrenDataModel;
import com.mackittipat.redditprogrammingfeed.model.reddit.RedditFeedModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RedditFeedService {

    private static final Logger log = LoggerFactory.getLogger(RedditFeedService.class);


    public List<RedditFeedDataChildrenDataModel> fetchData() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<RedditFeedModel> response = restTemplate.exchange(
                "http://www.reddit.com/r/programming/.json",
                HttpMethod.GET,
                null,
                RedditFeedModel.class);

        return null;
    }
}
