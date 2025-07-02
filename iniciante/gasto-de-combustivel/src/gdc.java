import java.util.Scanner;

public class gdc {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int tempo, velocidadeMedia;
        double autonomiaPorLitro = 12.00;

        tempo = scan.nextInt();
        velocidadeMedia = scan.nextInt();

        double litrosNecessarios = (tempo * velocidadeMedia) / autonomiaPorLitro;


        System.out.printf("%.3f%n",litrosNecessarios);


        scan.close();

    }
}
