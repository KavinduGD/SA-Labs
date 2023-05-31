package CompositeView;

public class Client {
    public static void main(String[] args) {
        // Creating individual views
        BasicView view1 = new View("View 1");
        BasicView view2 = new View("View 2");

        // Creating a composite view
        CompositeView compositeView = new CompositeView();
        compositeView.addSubview(view1);
        compositeView.addSubview(view2);

        // Rendering the composite view
        compositeView.render();
    }
}
