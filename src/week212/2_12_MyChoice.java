import java.awt.*;
import java.awt.event.*;

class MyChoice {
    private Frame f1;
    private Choice ch1;
    public MyChoice() {
        f1 = new Frame("フレーム");
        ch1 = new Choice();
        ch1.add("項目1");
        ch1.add("項目2");
        f1.add(ch1, BorderLayout.CENTER);        
        f1.setSize(200, 100);
        f1.setVisible(true);
        ch1.getSelectedItem();
        int i = ch1.getSelectedIndex();
    }
    public static void main(String[] args) {
        MyChoice obj = new MyChoice();
    }
}
