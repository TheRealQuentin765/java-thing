import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    JFormattedTextField textFieldA = new JFormattedTextField("a");
    JFormattedTextField textFieldB = new JFormattedTextField("b");
    JFormattedTextField textFieldC = new JFormattedTextField("c");

    JLabel labelSquared = new JLabel("x^2");
    JLabel labelX = new JLabel("x");

    JButton button = new JButton("Calculate");
    JPanel panel = new JPanel();
    JFrame frame = new JFrame("Quadratic equationator");
    JLabel label = new JLabel("Result: ");
    String textA;

    public GUI() {
        panel.setLayout(null); // Use null layout

        textFieldA.setBounds(10, 10, 20, 20);
        textFieldB.setBounds(50, 10, 20, 20);
        textFieldC.setBounds(90, 10, 20, 20);
        button.setBounds(10, 50, 100, 30);
        label.setBounds(10, 140, 200, 20);

        panel.add(textFieldA);
        panel.add(textFieldB);
        panel.add(textFieldC);
        panel.add(button);
        panel.add(label);

        button.addActionListener(this);

        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 300, 200); // Set frame size and position
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == button) {
           textA = textFieldA.getText();
           String textB = textFieldB.getText();
           textFieldA.selectAll();
           System.out.println(textA);
           label.setText("Result: " + textA);
       }
    }
}

