package GB_2.l6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        //IPv4 192.168.0.1 // 32 бита 4 байта
        //IPv6             // 128бит 16 байтов

        //оборачиваем сервер в искл try-with-resourses на закрытие в
        // случае
        // неиспользования порта
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            //cлушает на порте 8189 //от0 до 65000 но
            // больше 1024 тк они заняты
            System.out.println("ждем подключения клиента...");
            final Socket socket = serverSocket.accept();
            System.out.println("клиент подключился");

            //для чтения
            final DataInputStream in =
                    new DataInputStream(socket.getInputStream());
            //для отправки
            final DataOutputStream out =
                    new DataOutputStream(socket.getOutputStream());

            while(true){//poison pill
                final String message = in.readUTF();
                //при отправке енд отправляется клиенту
                // заканчивается цикл отправки сообщений
                if("/end".equalsIgnoreCase(message)){
                    out.writeUTF("/end");
                    break;
                }
                System.out.println("сообщение от клиента: " + message);
                out.writeUTF("[echo] " + message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

