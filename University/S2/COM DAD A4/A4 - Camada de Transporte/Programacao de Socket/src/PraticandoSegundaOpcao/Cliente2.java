package PraticandoSegundaOpcao;

import java.io.*;
import java.net.*;

public class Cliente2 {
  public static void main(String[] args) throws IOException {
    Socket socket = new Socket("localhost", 1234);
    System.out.println("Conectado ao servidor.");

    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

    BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
    String userInput;
    while ((userInput = stdIn.readLine()) != null) {
      out.println(userInput);
      System.out.println("Servidor: " + in.readLine());
    }

    socket.close();
  }
}
