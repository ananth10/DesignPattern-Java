package com.ananth.designpatterns.solid.liskov_substitution_principle.with_lsp;

public class Square implements Shape{

    private int side;

    public Square(int side){
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int computeArea() {
        return side*side;
    }
}
