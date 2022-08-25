package GB_2.l1.buttonAddActionListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApp {
    public static void main(String[] args) {
        JButton b1 = new JButton("1");//на кнопке текст: 1
        b1.addActionListener(new Button1Action());//действие завели
        // в классе Button1Action наследуется от системного
        // интерфейса ActionListener
        JButton b2 = new JButton("2");
        b1.addActionListener(new Button1Action());
        JButton b3 = new JButton("3");
        b1.addActionListener(new Button1Action());

        //но можно проще

        JButton b4 = new JButton("4");
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(4);
            }
        });
    }
}
