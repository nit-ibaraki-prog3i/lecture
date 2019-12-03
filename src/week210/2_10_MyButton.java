import java.awt.*;
import java.awt.event.*;

class MyButton {
    private Frame f1;
    private Button b1, b2;
    public MyButton() {
        f1 = new Frame("フレーム");

        b1 = new Button("Cancel");
        f1.add(b1, BorderLayout.WEST);
        b2 = new Button("OK");
        f1.add(b2, BorderLayout.EAST);

        f1.setSize(200, 100);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        MyButton obj = new MyButton();
    }
}
