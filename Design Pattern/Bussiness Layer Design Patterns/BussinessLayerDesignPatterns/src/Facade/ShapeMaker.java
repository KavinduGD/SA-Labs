package Facade;

public class ShapeMaker {

    private Shape rectangle;
    private Shape square;
    private Shape circle;

    public ShapeMaker(){
        circle= new Circle();
        square= new Square();
        rectangle= new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawSquare(){
        square.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    
}
