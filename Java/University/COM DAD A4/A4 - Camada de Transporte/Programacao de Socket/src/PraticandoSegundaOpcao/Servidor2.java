package PraticandoSegundaOpcao;

import java.io.*;
import java.net.*;

public class Servidor2 {
  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = new ServerSocket(1234);
    System.out.println("Aguardando conexão...");
    Socket clientSocket = serverSocket.accept();
    System.out.println("Conexão estabelecida.");

    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

    String inputLine;
    while ((inputLine = in.readLine()) != null) {
      System.out.println("Cliente: " + inputLine);
      out.println(inputLine);
    }

    serverSocket.close();
  }
}
