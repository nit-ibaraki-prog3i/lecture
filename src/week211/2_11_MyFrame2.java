import java.awt.*;
import java.awt.event.*;

class MyFrame2 {
    Frame f1;
    Button b1;
    public MyFrame2() {
        f1 = new Frame("フレーム");
        b1 = new Button("Exit");
        f1.add(b1, BorderLayout.CENTER);
        f1.pack();
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        MyFrame2 obj = new MyFrame2();
    }
}
