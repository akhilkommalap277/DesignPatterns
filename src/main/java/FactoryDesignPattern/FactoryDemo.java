package FactoryDesignPattern;

public class FactoryDemo {

    public static void main(String [] args) {

        ShapeFactory shape = new ShapeFactory();

        Shape shapeC = shape.getShape("Circle");
        shapeC.draw();

        Shape shapeR = shape.getShape("Rectangle");
        shapeC.draw();

        Shape shapeS = shape.getShape("Square");
        shapeC.draw();


    }

}
