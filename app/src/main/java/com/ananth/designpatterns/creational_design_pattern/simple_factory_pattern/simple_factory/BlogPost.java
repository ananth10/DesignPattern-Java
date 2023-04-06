package com.ananth.designpatterns.creational_design_pattern.simple_factory_pattern.simple_factory;

//Represents a blog post
public class BlogPost extends Post{

    private String author;
    public String[] tags;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
