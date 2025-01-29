package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) {
        String servidorIP = "localhost";
        int porta = 12345; // Mesma porta do servidor

        try (Socket socket = new Socket(servidorIP, porta)) {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter saida = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Digite uma mensagem para o servidor: ");
            String mensagem = teclado.readLine();
            saida.println(mensagem); //Envia a mensagem para o servidor
            //Recebe a proposta do servidor
            String resposta = entrada.readLine();
            System.out.println("Servidor responde: " + resposta);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
