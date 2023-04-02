package com.ananth.designpatterns.solid.liskov_substitution_principle.with_lsp;

public class Main {


    public static void main(String[] args){

        Rectangle rectangle = new Rectangle(10,20);
        System.out.println(rectangle.computeArea());

        Square square = new Square(10);
        System.out.println(square.computeArea());

        useRectangle(rectangle);
        useSquare(square);
    }

    /**
     * Here we did not change the behavior of parent class
     * */
    static void useRectangle(Rectangle rectangle){
        rectangle.setWidth(10);
        rectangle.setHeight(30);

        assert rectangle.getHeight()==30 : "Height is not equal";
        assert rectangle.getWidth()==10 : "Width is not equal";
    }


    static void useSquare(Square square){
        square.setSide(10);

        assert square.getSide()==10 : "Side is not equal";
    }
}
