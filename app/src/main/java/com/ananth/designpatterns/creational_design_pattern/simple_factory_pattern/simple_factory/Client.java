package com.ananth.designpatterns.creational_design_pattern.simple_factory_pattern.simple_factory;

public class Client {

    public static void main(String[] args) {
      Post post = PostFactory.createPost("News");
        System.out.println(post);
    }
}
