package com.ananth.designpatterns.creational_design_pattern.simple_factory_pattern.simple_factory;

//this class act as a simple factory for creation of different post for a website
public class PostFactory {

    public static Post createPost(String postType) {
        switch (postType) {
            case "blog":
                return new BlogPost();
            case "product":
                return new ProductPost();
            case "News":
                return new NewsPost();
            default:
                throw new IllegalArgumentException("Post type is unknown");
        }
    }
}
