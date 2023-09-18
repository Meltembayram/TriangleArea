package Hipotenus;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args){
        //Değerleri girelim
        int a,b,c;
        double u,cev, alan;

        Scanner ucgen = new Scanner(System.in);
        System.out.println("1. Kenari giriniz : ");
        a = ucgen.nextInt();
        System.out.println("2.Kenari Giriniz : ");
        b = ucgen.nextInt();
        System.out.println("3.Kenari Giriniz : ");
        c= ucgen.nextInt();

        //Üçgenin çevresi
        u = (a+b+c)/2;
        cev = 2 * u;
        System.out.println(" Ucgenin cevresi :" + cev);
        //Üçgenin alanı
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Ucgenin alani : "+ alan);



    }
}
