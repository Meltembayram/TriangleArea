package KDVPractice;

import java.util.Scanner;
    //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
    // tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

public class Main {
    public static void main(String[] args){
        double fiyat , kdv, kdvliTutari, kdvTutar ;
        Scanner inp = new Scanner(System.in);
        System.out.println("Fiyati giriniz : " );
        fiyat =inp.nextDouble();

        kdv = (fiyat >= 1000.0) ? 0.08 : 0.18;    // fiyat 1000 TL üzerinde ise kdv %8, değil ise %18
        kdvTutar = fiyat * kdv;
        kdvliTutari = kdvTutar + fiyat;
        System.out.println("KDV tutari : " + kdvTutar);
        System.out.println("Odenecek tutar :" + kdvliTutari);



    }
}
