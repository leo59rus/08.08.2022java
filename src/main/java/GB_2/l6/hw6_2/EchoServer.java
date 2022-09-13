package GB_2.l6.hw6_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import static java.lang.System.out;

public class EchoServer {
    private static Socket socket;
    private static DataInputStream inServ; //для приема сообщений
    private static DataOutputStream outServ;//для отправки сообщений

    public static void main(String[] args) {
        //IPv4 192.168.0.1 // 32 бита 4 байта
        //IPv6             // 128бит 16 байтов

        //оборачиваем сервер в искл try-with-resourses на закрытие в
        // случае
        // неиспользования порта
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            //cлушает на порте 8189 //от0 до 65000 но
            // больше 1024 тк они заняты
            out.println("ждем подключения клиента...");
            final Socket socket = serverSocket.accept();
            out.println("клиент подключился");

            //для чтения
            inServ =
                    new DataInputStream(socket.getInputStream());
            //для отправки
            outServ =
                    new DataOutputStream(socket.getOutputStream());

            while (true) {//poison pill таблетку кидаем для
                //выхода из цикла переписки в данном случае /энд
                final String message = inServ.readUTF();
                //при отправке енд отправляется клиенту
                // заканчивается цикл отправки сообщений
                if ("/end".equalsIgnoreCase(message)) {
                    outServ.writeUTF("/end");
                    break;
                }
               // openConnection();
                Scanner scanner = new Scanner(System.in);

                    System.out.println("Сообщение от клиента: " + message);
                    // System.out.println("сообщение от клиента: " +
                    // message);
                    outServ.writeUTF(message);



            }
        } catch (IOException c) {
            c.printStackTrace();
        }
    }


    private static void sendMessage(String message) {
        try {
            outServ.writeUTF(message);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private static void openConnection() throws IOException {
        //ip adress адрес локальной машины(host) моей, везде такой
        // один
        //порт как у сервера
        socket = new Socket("127.0.0.1", 8189);
        //создаем вход выход сообщений
        inServ = new DataInputStream(socket.getInputStream());
        outServ = new DataOutputStream(socket.getOutputStream());
        new Thread(() -> {
            try {
                while (true) {
                    final String message = inServ.readUTF();//ждем
                    // сообщение от
                    // сервера
                    if ("/end".equalsIgnoreCase(message)) {
                        break;
                    }
                    System.out.println("Сообщение от клиента: " + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }).start();
    }
}
