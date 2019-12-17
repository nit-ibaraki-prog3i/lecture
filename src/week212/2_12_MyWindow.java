import java.awt.*;
import java.awt.event.*;

class MyWindow {
    private Frame f1;
    public MyWindow() {
        f1 = new Frame("フレーム");
        f1.addWindowListener(new MyWinListener());
        f1.setSize(200, 100);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        MyWindow obj = new MyWindow();
    }
}

class MyWinListener implements WindowListener {
    public void windowClosing(WindowEvent e) {
        System.out.println("終了します。");
        System.exit(0);
    }
    public void windowClosed(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}
}
