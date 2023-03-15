package Praticando;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
  public static void main(String[] args) {
    try {
      // Cria um servidor na porta 12345
      ServerSocket servidor = new ServerSocket(12345);
      System.out.println("Servidor iniciado na porta 12345");

      while (true) {
        // Aguarda a conexão de um cliente
        Socket cliente = servidor.accept();
        System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());

        // Cria um BufferedReader para ler as mensagens enviadas pelo cliente
        BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));

        // Cria um PrintWriter para enviar as mensagens de volta para o cliente
        PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);

        // Lê a mensagem enviada pelo cliente
        String mensagem = in.readLine();
        System.out.println("Mensagem recebida do cliente: " + mensagem);

        // Converte a mensagem para maiúsculas e envia de volta para o cliente
        String mensagemEmMaiusculas = mensagem.toUpperCase();
        out.println(mensagemEmMaiusculas);

        // Fecha a conexão com o cliente
        cliente.close();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

