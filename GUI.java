import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{
    public GUI(){
    }

    public int quadraticGUI(){
        JFrame frame = new JFrame("Quadratic equationator");
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        JButton button = new JButton();
        JFormattedTextField textField = new JFormattedTextField(2);
        textField.addActionListener(this);
        panel.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
        panel.setLayout(new GridLayout(0,1));

        frame.setVisible(true);
        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        return 0;
    }
    public actionPerformed(ActionEvent event){
//        text
        //Change in branch_1
    }
}
