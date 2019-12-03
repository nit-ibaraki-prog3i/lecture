import java.awt.*;
import java.awt.event.*;

class MyFrame {
    private Frame f1;
    public MyFrame() {
        f1 = new Frame("フレーム");
        f1.setSize(200, 100);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        MyFrame obj = new MyFrame();
    }
}
