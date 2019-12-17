import java.awt.*;
import java.awt.event.*;

class MyLayout {
    private Frame f1;
    public MyLayout() {
        f1 = new Frame("MyLayout");
        f1.setLayout(new FlowLayout());
        f1.add(new Button("Sunday"));
        f1.add(new Button("Monday"));
        f1.add(new Button("Tuesday"));
        f1.add(new Button("Wednesday"));
        f1.add(new Button("Thursday"));
        f1.add(new Button("Friday"));
        f1.add(new Button("Saturday"));
        f1.setSize(900, 300);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        MyLayout obj = new MyLayout();
    }
}
