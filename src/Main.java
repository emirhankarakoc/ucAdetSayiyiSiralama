import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz.");
        a = scanner.nextInt();
        System.out.println("Ikinci sayiyi biriniz.");
        b = scanner.nextInt();
        System.out.println("Ucuncu sayiyi giriniz.");
        c = scanner.nextInt();

        if (a>=b && a>=c){
            if(b>=c)System.out.println("" + a+b+c);
            else if (c>=b)  System.out.println("" + a+c+b);
        }



        else if(b>=c && b>=a){
            if(c>=a) System.out.println(""+b+c+a);
            else if(a>=c) System.out.println(""+b+a+c);
        }
        else if(c>=b && c>=a){
            if (b>=a) System.out.println("" + c+b+a);
            else if(a>=b) System.out.println(" "+c+a+b);



        }
    }
}