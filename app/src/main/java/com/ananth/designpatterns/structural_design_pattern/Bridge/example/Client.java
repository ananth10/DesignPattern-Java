package com.ananth.designpatterns.structural_design_pattern.Bridge.example;

public class Client {

    public static void main(String[] args){

        FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());
        collection.offer(10);
        collection.offer(20);
        collection.offer(40);

        System.out.println(collection.poll());
        System.out.println(collection.poll());

    }
}
