import java.awt.*;
import java.awt.event.*;

class MyFrame implements ActionListener {
    private Frame f1;
    private Button ok, cancel, exit;
    MyFrame() {
        f1 = new Frame("Buttons");
        cancel = new Button("Cancel");
        ok = new Button("OK");
        exit = new Button("Exit");
        f1.setLayout(new FlowLayout());
        f1.add(cancel);
        f1.add(ok);
        f1.add(exit);
        cancel.addActionListener(this);
        ok.addActionListener(this);
        exit.addActionListener(this);
        f1.pack();
        f1.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cancel) {
            System.out.println("キャンセル");
        }
        if(e.getSource()==ok) {
            System.out.println("OK");            
        }
    }
    public static void main(String[] args) {
        MyFrame obj = new MyFrame();
    }
}
