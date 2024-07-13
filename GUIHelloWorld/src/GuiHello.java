import javax.swing.*;

public class GuiHello {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World!");
        frame.setSize(300, 300);
//        JLabel label = new JLabel("Hello World!", JLabel.CENTER);
        frame.add(new HelloComponent("Hello World!"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}