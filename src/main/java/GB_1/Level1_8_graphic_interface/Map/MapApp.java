package GB_1.Level1_8_graphic_interface.Map;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MapApp extends JFrame {//для создания окна
    // наследуемся от JFrame
    private int x = 200;
    private int y = 200;
    private int size = 40;

    public MapApp() {  //конструктор окна

        setTitle("MY MAP");//заголовок окна
        setBounds(600, 200, 600, 600);//располоение верхнего левого
        // угла, размер
        setDefaultCloseOperation(EXIT_ON_CLOSE);//завершение
        // программы при закрытии
        setResizable(false);//размер не поменять не растянуть окно

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);//отключил компановщик элементов
        mainPanel.setBackground(Color.decode("#008800"));//цвет панели
        add(mainPanel, BorderLayout.CENTER);//размещение центр

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 4));//1
        // строка 4 столбца

        buttonsPanel.setPreferredSize(new Dimension(1, 40));
        //задали размер нижней панели ширина 1 игнорируется тк
        // растягивается юг по ширине окна, а высота задется 40
        add(buttonsPanel, BorderLayout.SOUTH);

        JPanel rectPanel = new JPanel();//панель прямоугольник
        rectPanel.setBounds(x, y, size, size);//координаты, размер
        mainPanel.add(rectPanel);

        JButton buttonDown = new JButton("DOWN");
        buttonsPanel.add(buttonDown);//добавили кнопку

        buttonDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                y += 20;
                rectPanel.setBounds(x, y, size, size);
            }
        });


        JButton buttonUp = new JButton("UP");
        buttonsPanel.add(buttonUp);//добавили кнопку

        buttonUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                y -= 20;
                rectPanel.setBounds(x, y, size, size);
            }
        });

        JButton buttonLeft = new JButton("LEFT");
        buttonsPanel.add(buttonLeft);
        buttonLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x -= 20;
                rectPanel.setBounds(x, y, size, size);
            }
        });

        JButton buttonRight = new JButton("RIGHT");
        buttonsPanel.add(buttonRight);
        buttonRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x += 20;
                rectPanel.setBounds(x, y, size, size);
            }
        });


        setVisible(true);//видимомть ставится в конце для
        // отсутствия искажения

    }


}
