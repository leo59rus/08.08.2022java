package GB_2.l6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    private Socket socket;
    private DataInputStream in; //для приема сообщений
    private DataOutputStream out;//для отправки сообщений


    public static void main(String[] args) {
        new EchoClient().start();
    }

    private void start() {
        try {
            openConnection();//метод открытия соединения с сервером
            Scanner scanner = new Scanner(System.in);
            while (!socket.isClosed()) {
                sendMessage(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendMessage(String message) {
        try{
            out.writeUTF(message);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    //открытие соединение с сервером
    private void openConnection() throws IOException {
        //ip adress адрес локальной машины(host) моей, везде такой
        // один
        //порт как у сервера
        socket = new Socket("127.0.0.1", 8189);
        //создаем вход выход сообщений
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        new Thread(() -> {
            try {
                while (true) {
                    final String message = in.readUTF();//ждем
                    // сообщение от
                    // сервера
                    if ("/end".equalsIgnoreCase(message)) {
                        break;
                    }
                    System.out.println("Сообщение от сервера: " + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                closeConnection();

                }

        }).start();
    }

    private void closeConnection() {
        if(in != null){
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (out!= null){
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (socket!=null){
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
