
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //variaveis
        double raio, volume;
        
        //entrada de dados
        raio = leia.nextDouble();
        
        //processamento
        volume = (4/3.0) * (3.14159 * Math.pow(raio,3));
        
        //saida de dados 
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
