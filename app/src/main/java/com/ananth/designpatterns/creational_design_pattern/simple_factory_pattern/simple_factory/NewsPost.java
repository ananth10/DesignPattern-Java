package com.ananth.designpatterns.creational_design_pattern.simple_factory_pattern.simple_factory;

import java.time.LocalDateTime;

//Represents new post
public class NewsPost extends Post{

    private String headLine;
    private LocalDateTime newsTime;

    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public LocalDateTime getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(LocalDateTime newsTime) {
        this.newsTime = newsTime;
    }
}
