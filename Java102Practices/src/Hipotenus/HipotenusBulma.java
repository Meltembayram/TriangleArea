package Hipotenus;
import java.util.Scanner;
public class HipotenusBulma {
    public static void main(String[] args){
        int a , b;
        double c;

        Scanner yeni = new Scanner(System.in);
        System.out.println("1.Kenari Giriniz : ");
        a = yeni.nextInt();
        System.out.println("2.Kenari Giriniz : ");
        b = yeni.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus : " + c);


    }
}
