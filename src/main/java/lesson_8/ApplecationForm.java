package lesson_8;

import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplecationForm extends JFrame {

    public int res = 0;
    private JTextField inputField;

    public ApplecationForm() throws HeadlessException, ScriptException {
        setTitle("Калькулятор"); // заголовок
        setBounds(800, 200, 300, 450); // размер окошка
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // метод который останавливает программу после закрытия окна

        setJMenuBar(createMenu()); // вызываем меню-бар

        setLayout(new BorderLayout());

        add(createTop(), BorderLayout.NORTH); // разместили панель ввода
        add(createBottom(), BorderLayout.CENTER); // разместили панель с кнопочками

        setVisible(true); // показывает окно


    }


    private JMenuBar createMenu() { // метод создания меню
        JMenuBar menuBar = new JMenuBar(); // создем меню-бар
        JMenu menu = new JMenu("Меню"); // в меню-бар создаем меню
        menuBar.add(menu); // добавляем меню в меню-бар

        menu.add(new JMenuItem("Очистить")); // в меню создаем две кнопки
        JMenuItem exit = menu.add(new JMenuItem("Выход"));
        exit.addActionListener(new ExitButtonListener()); // назначили кнопке действие
        return menuBar;
    }

    private JPanel createTop() { // создаем панель отображения ввода данных
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());

        inputField = new JTextField(); // объявляем что панель будет с текстовым вводом
        inputField.setEditable(false);

        top.add(inputField);
        return top;
    }

    private JPanel createBottom() { // панель с кнопками
        JPanel bottom = new JPanel();
        bottom.setLayout(new BorderLayout());

       


// БЛОК С ЦИФРАМИ
        JPanel digitsPanel = new JPanel();
        bottom.add(digitsPanel, BorderLayout.CENTER);
        digitsPanel.setLayout(new GridLayout(4, 3));

        ActionListener buttonListener = new ButtonListener(inputField);

        for (int i = 1; i <= 10; i++) {
            String buttonTitle = (i == 10) ? "0" : String.valueOf(i);
            JButton btn = new JButton(buttonTitle);
            btn.addActionListener(buttonListener);
            digitsPanel.add(btn);
        }

        JButton calc = new JButton("=");

        digitsPanel.add(calc);

        JButton clear = new JButton("C");
/*        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
            }
        });*/
        clear.addActionListener(e -> inputField.setText(""));
        digitsPanel.add(clear);


// БЛОК С ОПЕРАТОРАМИ
        JLabel result = new JLabel("result");


        ActionListener listenerPlus = e -> {
            int x_1 = Integer.parseInt(inputField.getText());
            int x_2 = Integer.parseInt(inputField.getText());
            res = x_1 + x_2;
            result.setText(String.valueOf(res));
        };

        ActionListener listenerMinus = e -> {
            int x_1 = Integer.parseInt(inputField.getText());
            int x_2 = Integer.parseInt(inputField.getText());
            res = x_1 - x_2;
            result.setText(String.valueOf(res));
        };

        ActionListener listenerMultiply = e -> {
            int x_1 = Integer.parseInt(inputField.getText());
            int x_2 = Integer.parseInt(inputField.getText());
            res = x_1 * x_2;
            result.setText(String.valueOf(res));
        };

        ActionListener listenerDivision = e -> {
            int x_1 = Integer.parseInt(inputField.getText());
            int x_2 = Integer.parseInt(inputField.getText());
            res = x_1 / x_2;
            result.setText(String.valueOf(res));
        };
        JPanel operatingPanel = new JPanel();
        bottom.add(operatingPanel, BorderLayout.WEST);
        operatingPanel.setLayout(new GridLayout(4, 1));

        JButton minus = new JButton("-");
        minus.addActionListener(listenerMinus);
        operatingPanel.add(minus);

        JButton plus = new JButton("+");
        plus.addActionListener(listenerPlus);
        operatingPanel.add(plus);

        JButton multiply = new JButton("×");
        multiply.addActionListener(listenerMultiply);
        operatingPanel.add(multiply);

        JButton division = new JButton("÷");
        division.addActionListener(listenerDivision);
        operatingPanel.add(division);

        return bottom;
    }

}
