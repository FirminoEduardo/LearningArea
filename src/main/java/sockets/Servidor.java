package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Paths;

public class Servidor {
    public static void main(String[] args) {
        int porta = 12345; //Porta no qual o servidor vai escutar

        try (ServerSocket serverSocket = new ServerSocket(porta)) {
            System.out.println("Servidor aguardando conexões na porta " + porta);

            while (true) {
                Socket socket = serverSocket.accept(); // aceita conexão com cliente
                System.out.println("Cliente conectado " + socket.getInetAddress());

                //Criando streams de entrada e saída
                BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter saida =  new PrintWriter(socket.getOutputStream(), true);

                //Lendo mensagens do cliente
                String mensagem = entrada.readLine();
                System.out.println("Cliente disse: " + mensagem);

                //Respondendo ao cliente
                saida.println("Respondendo ao cliente" + mensagem);

                socket.close(); //Fecha conexão com o cliente
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
