package CompositeView;


    public class View implements BasicView {
        private String content;
    
        public View(String content) {
            this.content = content;
        }
    
        @Override
        public void render() {
            System.out.println("Rendering View: " + content);
        }
    }