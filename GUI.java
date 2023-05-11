import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    JFormattedTextField textFieldA = new JFormattedTextField("a");
    JFormattedTextField textFieldB = new JFormattedTextField("b");
    JFormattedTextField textFieldC = new JFormattedTextField("c");

    JButton button = new JButton("Calculate");
    JPanel panel = new JPanel();
    JFrame frame = new JFrame("Quadratic equationator");
    JLabel label = new JLabel("Result: ");
    String textA;
    public GUI() {

        textFieldA.setColumns(10);
        textFieldA.addActionListener(this);

        label.setAlignmentX(30);
        label.setAlignmentY(40);

        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout(null);
        label.setBounds(100,200,100,100);
        frame.setBounds(500,500,1000,1000);


        panel.add(textFieldA);
        panel.add(button);
        panel.add(label);


        button.addActionListener(this);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
       if(event.getSource() == button) {
           textA = textFieldA.getText();
           textFieldA.selectAll();
           System.out.println(textA);
           label.setText("Result: " + textA);
       }
    }
}

