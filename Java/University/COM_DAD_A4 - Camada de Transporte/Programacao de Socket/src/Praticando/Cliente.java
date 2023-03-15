package Praticando;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {
  public static void main(String[] args) {
    try {
      // Cria um socket para se conectar ao servidor na porta 12345
      Socket socket = new Socket("localhost", 12345);
      System.out.println("Conectado ao servidor");

      // Cria um BufferedReader para ler as mensagens enviadas pelo servidor
      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

      // Cria um PrintWriter para enviar as mensagens para o servidor
      PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

      // Lê a mensagem digitada pelo usuário
      BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Digite uma mensagem para enviar ao servidor: ");
      String mensagem = teclado.readLine();

      // Envia a mensagem para o servidor
      out.println(mensagem);

      // Lê a mensagem enviada pelo servidor e exibe na tela
      String mensagemRecebida = in.readLine();
      System.out.println("Mensagem recebida do servidor: " + mensagemRecebida);

      // Fecha a conexão com o servidor
      socket.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}


