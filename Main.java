import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

class MouseLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Label");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Mouse is Stopped");
        label.setBounds(100, 100, 200, 200);

        frame.add(label);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        frame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                label.setText("Mouse is Moving");
            }
        });

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                label.setText("Mouse Stopped");
            }
        });
    }
}
