package GB_1.Level1_8_graphic_interface.quessNumber;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {//для создания окна
    // наследуемся от JFrame

    private JTextField textField;
    private int randomNumber;

    private int attempt = 0;


    public int getRandomNumber() {
        return randomNumber;
    }

    public MyWindow() {  //конструктор окна
        this.randomNumber = (int)(Math.random() * 10) + 1;//от [1до10]

        setTitle("Игра: УГАДАЙ ЧИСЛО");//заголовок окна
        setBounds(600, 300, 830, 170);//располоение верхнего левого
        // угла, размер
        setDefaultCloseOperation(EXIT_ON_CLOSE);//завершение
        // программы при закрытии
        setResizable(false);//размер не поменять не растянуть окно

        textField = new JTextField();//однострочное
        // текстовое поле

        add(textField, BorderLayout.NORTH);

        textField.setText("Программа загадала число от 1 до 10. " +
                                  "угадай с 3х попыток!");
        //вывод текста в окне ввода

        textField.setHorizontalAlignment(SwingConstants.CENTER);
        //расположенеи текста по центру окна

        textField.setEditable(false);//запрет на изменяемость окна
        // ввода



        Font font = new Font("Arial", Font.PLAIN, 24);//шрифт,
        // стиль, размер
        textField.setFont(font);// определяем этот фонт для textField


        JPanel buttonsPanel = new JPanel(new GridLayout(1, 10));
        //создали панель кнопок 1 строка, 10 столбов

        buttonsPanel.setBackground(Color.BLUE);//цвет панели
        add(buttonsPanel, BorderLayout.CENTER);

        //создаем кнопки на панеле
        for (int i = 1; i <= 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setFont(font);
            buttonsPanel.add(button);

            int buttonIndex = i;//тк i не дотягивается до нижнего
            // метода переопределяем переменную
            button.addActionListener(new ActionListener() {
                //прослушивание действий на кнопку
                @Override
                public void actionPerformed(ActionEvent e) {
                    tryToAnswer(buttonIndex);
                }
            });
        }

        JButton reset = new JButton("RESET");
        reset.setBackground(Color.green);//цвет панели
        add(reset, BorderLayout.SOUTH);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Программа загадала число от 1 до" +
                                          " 10, угадай с 3х " +
                                          "попыток!");
                randomNumber = (int)(Math.random() * 10) + 1;
                attempt = 0;
            }
        });

        setVisible(true);//видимомть ставится в конце для
        // отсутствия искажения

    }

    public void tryToAnswer(int answer){
        attempt += 1;

        if (answer == randomNumber && attempt <= 3) {
            textField.setText("you WIN! JAVA_M загадала: " + answer +
                                      " " +
                                      "(угадал c " + attempt + " " +
                                      "попытки) нажми RESET");

        } else if (attempt == 3 && randomNumber != answer){
            textField.setText("3 попытки иссякли, JAVA_M загадала: " + randomNumber + "! МАША LOSE((");
        } else if (answer > randomNumber && attempt < 4){
            textField.setText("не угадал, загаданное число меньше " +
                                      "чем " + answer + "! еще " + (3 - attempt) + " попытки");
        } else if (answer < randomNumber && attempt < 4){
            textField.setText("не угадал, загаданное число больше " +
                                      "чем " + answer + "! еще " + (3 - attempt) + " попытки");
        } else {
            textField.setText("3 попытки иссякли, JAVA_M загадала: " + randomNumber + "! МАША LOSE((");
        }

    }
}
