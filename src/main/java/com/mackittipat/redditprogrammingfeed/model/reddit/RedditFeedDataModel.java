package com.mackittipat.redditprogrammingfeed.model.reddit;

import java.util.List;

public class RedditFeedDataModel {

    private List<RedditFeedDataChildrenModel> children;

    public List<RedditFeedDataChildrenModel> getChildren() {
        return children;
    }

    public void setChildren(List<RedditFeedDataChildrenModel> children) {
        this.children = children;
    }
}
