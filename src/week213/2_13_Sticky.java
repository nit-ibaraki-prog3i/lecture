import java.awt.*;
import java.awt.event.*;

class MySticky implements ActionListener {
    private Frame f1;
    private TextField tf1;
    private Button b1;
    private Label l1;
    MySticky() {
        f1 = new Frame("Sticky");
        tf1 = new TextField("何か入力してください");
        b1 = new Button("New");
        l1 = new Label("ラベル");

        f1.add(tf1, BorderLayout.NORTH);
        f1.add(b1, BorderLayout.CENTER);
        f1.add(l1, BorderLayout.SOUTH);

        f1.pack();
        f1.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
    }
    public static void main(String[] args) {
        MySticky obj = new MySticky();
    }
}
