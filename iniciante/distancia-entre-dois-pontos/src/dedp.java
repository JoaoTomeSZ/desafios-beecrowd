import java.util.Scanner;
import java.util.Locale;

public class dedp {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);


        double x1,x2,y1,y2;

        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();


        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f%n",distancia);

        scan.close();




    }

}
