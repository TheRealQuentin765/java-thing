import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    JFormattedTextField textFieldA = new JFormattedTextField("");
    JFormattedTextField textFieldB = new JFormattedTextField("");
    JFormattedTextField textFieldC = new JFormattedTextField("");
    JFormattedTextField blankTextField = new JFormattedTextField("");
    JLabel labelSquared = new JLabel("x^2 +");
    JLabel labelX = new JLabel("x +");

    JButton button = new JButton("Calculate");
    JPanel panel = new JPanel();
    JFrame frame = new JFrame("Quadratic equationator");
    JLabel x1 = new JLabel("X = ");
    JLabel x2 = new JLabel("X = ");


    public GUI() {
        panel.setLayout(null); // Use null layout

        textFieldA.setBounds(10, 10, 30, 20);
        textFieldB.setBounds(80, 10, 30, 20);
        textFieldC.setBounds(130, 10, 30, 20);
        button.setBounds(10, 50, 100, 30);
        x1.setBounds(10, 80, 200, 20);
        x2.setBounds(10, 100, 200, 20);
        labelSquared.setBounds(40,10,40,20);
        labelX.setBounds(110,10,40,20);

        panel.add(labelSquared);
        panel.add(labelX);
        panel.add(textFieldA);
        panel.add(textFieldB);
        panel.add(textFieldC);
        panel.add(button);
        panel.add(x1);
        panel.add(x2);

        button.addActionListener(this);

        frame.setContentPane(panel);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 300, 200); // Set frame size and position
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event) {
        Double A;
        Double B;
        Double C;
        if(event.getSource() == button) {
            if(textFieldA.equals(blankTextField)){
                A = 1.0;
            }else{
                A = Double.parseDouble(textFieldA.getText());}
            if(textFieldB == blankTextField){
                B = 1.0;
            }else{
                B = Double.parseDouble(textFieldB.getText());
            }
           if(textFieldC == blankTextField){
               C = 0.0;
           }else{
               C = Double.parseDouble(textFieldC.getText());
           }

           x1.setText("X = " + QuadraticCalculator.calculate(A,B,C).getNum2());
           x2.setText("X = " + QuadraticCalculator.calculate(A,B,C).getNum1());
       }
    }
}

