import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    public GUI() {
    }

//    JFormattedTextField textField = new JFormattedTextField(2);

    public int quadraticGUI() {
        JFrame frame = new JFrame("Quadratic equationator");
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        JButton button = new JButton();

//        textField.addActionListener(this);
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout(new GridLayout(0, 1));

        frame.setVisible(true);
        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        return 0;
    }

//    public void actionPerformed(ActionEvent event) {
//        String text = textField.getText();
//        textField.selectAll();
//    }
}

