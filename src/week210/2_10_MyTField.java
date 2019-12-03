import java.awt.*;
import java.awt.event.*;

class MyTField {
    private Frame f1;
    private TextField tf1, tf2, tf3;
    public MyTField() {
        f1 = new Frame("フレーム");

        tf1 = new TextField();
        f1.add(tf1, BorderLayout.NORTH);
        tf2 = new TextField("入力して下さい");
        f1.add(tf2, BorderLayout.CENTER);
        tf3 = new TextField(50);
        f1.add(tf3, BorderLayout.SOUTH);

        f1.pack();
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        MyTField obj = new MyTField();
    }
}
