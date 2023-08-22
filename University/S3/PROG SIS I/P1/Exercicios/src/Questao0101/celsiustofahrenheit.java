package Questao0101;
import java.util.Scanner;
class celsiustofahrenheit {
    public static void main(String[] args)
    {
        double celsius, fahrenheit;
        
        Scanner entrada = new Scanner(System.in);
        celsius = entrada.nextDouble();
        
        
        // formula for conversion
        fahrenheit = 9*(celsius / 5) + 32;
        System.out.println(fahrenheit);
    }
}
