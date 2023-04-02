package com.ananth.designpatterns.solid.liskov_substitution_principle.without_lsp;

public class Main {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(10,20);
        System.out.println(rectangle.computeArea());

        Square square = new Square(10);
        System.out.println(square.computeArea());

        useRectangle(rectangle);

        useRectangle(square);

    }

    /**
     * Below function set height and width for both rectangle and square, and assertion will fail for square because
     * first setting width as 10 and second setting height as 30, so if you see Square class both setHeight and setWidth calling serSide function, so
     * finally 30 will be the length of 4 side of square. so test will fail in this case
     *
     *Here we are able to substitute child instead of parent class but its changing the behavior of parent class
     * and its violation of Liskov principle
     * */
   static void useRectangle(Rectangle rectangle){
        rectangle.setWidth(10);
        rectangle.setHeight(30);

        assert rectangle.getHeight()==30 : "Height is not equal";
        assert rectangle.getWidth()==10 : "Width is not equal";
    }
}
