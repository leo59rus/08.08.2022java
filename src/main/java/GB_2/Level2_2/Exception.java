package GB_2.Level2_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exception {
    public static void main(String[] args) {
        FileOutputStream outputStream = null;

        try {
            outputStream = new FileOutputStream("1.txt");//создали
            // файл
            outputStream.write(65);//добавили инф
            outputStream.close();//закрыли
        } catch (IOException e) {
            e.printStackTrace();
        }finally{//сработает всегда тк надо файл все равно закрыть!
            try {
                outputStream.close();//закрыли
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
