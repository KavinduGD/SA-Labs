package CompositeView;

import java.util.ArrayList;
import java.util.List;

public class CompositeView implements BasicView {
    private List<BasicView> subviews;

    public CompositeView() {
        this.subviews = new ArrayList<>();
    }

    public void addSubview(BasicView view) {
        subviews.add(view);
    }

    public void removeSubview(BasicView view) {
        subviews.remove(view);
    }

    @Override
    public void render() {
        System.out.println("Rendering Composite View");

        // Render all the subviews
        for (BasicView subview : subviews) {
            subview.render();
        }
    }
}
