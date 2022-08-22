package GB_1.Level1_8_graphic_interface.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {//для создания окна
    // наследуемся от JFrame

    public MyWindow() {  //конструктор окна
        setTitle("My simple Window");//заголовок окна
        setBounds(600, 300, 400, 400);//располоение верхнего левого
        // угла, размер
        setDefaultCloseOperation(EXIT_ON_CLOSE);//завершение
        // программы при закрытии

        JButton button = new JButton("Click Me!!");//создали кнопку
        add(button, BorderLayout.NORTH);//добавили
        // кнопку, дали местонахождение

        Font font = new Font("Arial", Font.PLAIN, 20);//шрифт,
        // стиль, размер
        button.setFont(font);// определяем этот фонт для button

        JTextArea textArea = new JTextArea();//создали область ввода
        // текста
        add(textArea, BorderLayout.CENTER);

        button.addActionListener(new ActionListener() {//описание
            // функции кнопки
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(1);
            }
        });


        setVisible(true);//видимомть

    }
}
