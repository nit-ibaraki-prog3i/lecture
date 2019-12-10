import java.awt.*;
import java.awt.event.*;

class MyFrame3 implements ActionListener {
    Frame f1;
    Button b1;
    public MyFrame3() {
        f1 = new Frame("フレーム");
        b1 = new Button("Exit");
        f1.add(b1, BorderLayout.CENTER);
        // addActionListenerの引数を変更する
        // thisは自身を指すキーワード
        b1.addActionListener(this); 
        f1.pack();
        f1.setVisible(true);
    }
    //actionPerformedメソッドを追加する
    public void actionPerformed(ActionEvent e) {
        System.out.println("押されたボタン名: " 
                + e.getActionCommand());
        System.out.println("終了します。");
        System.exit(0);
    }
    public static void main(String[] args) {
        MyFrame3 obj = new MyFrame3();
    }
}
