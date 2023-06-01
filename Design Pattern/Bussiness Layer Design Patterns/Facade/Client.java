package Facade;

public class Client {

    public static void main(String[] args) {

    // Rectangle rectangle= new Rectangle();
    // Square squre= new Square();
    // Circle circle= new Circle();
    // rectangle.draw();  
    // squre.draw();
    // circle.draw();

    ShapeMaker shapeMaker= new ShapeMaker();

    shapeMaker.drawCircle();
    shapeMaker.drawSquare();
    shapeMaker.drawRectangle();



    }
  

    
}
