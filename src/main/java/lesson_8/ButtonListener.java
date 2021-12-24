package lesson_8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private JTextField inputField;

    public ButtonListener(JTextField inputField) {

        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        // выражение на экране калькулятора
         inputField.setText(inputField.getText() + btn.getText());

   }

}

