package GB_1.Level1_8_graphic_interface.note;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Note extends JFrame{
    private JTextArea textArea;

    public Note(){
        setTitle("MY NOTE");
        setBounds(300,300,400,500);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);//в
        // скроллинг добавили наше окно для записи
        add(scrollPane, BorderLayout.CENTER);//разместили в центр

        //добавляем создаем кнопку сэйв
        JButton saveButton = new JButton("SAVE");

        //при нажатии сохраняем чз метод
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveToFile("1.txt");
            }
        });

        add(saveButton, BorderLayout.SOUTH);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
public void saveToFile(String filename){//метод сохранения
        try{
            Files.write(Paths.get(filename),
                    textArea.getText().getBytes(),
                    StandardOpenOption.CREATE);
        } catch (IOException e){
            e.printStackTrace();
        }
}
}
