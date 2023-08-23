package Giris;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişkenler
        int mat, kim, fiz, tur, tar, muz;

        Scanner inp = new Scanner(System.in);

        //Değerleri kullanıcıdan al
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();


        System.out.print("Kimya Notunuz : ");
        kim = inp.nextInt();


        System.out.print("Fizik Notunuz : ");
        fiz = inp.nextInt();


        System.out.print("Türkçe Notunuz : ");
        tur = inp.nextInt();


        System.out.print("Tarih Notunuz : ");
        tar = inp.nextInt();


        System.out.print("Müzik Notunuz : ");
        muz = inp.nextInt();

        int toplam =  (mat + fiz + kim + tar + tur + muz );
        double sonuc = toplam / 6.0;
        boolean kosul1 = sonuc > 60.0;
        System.out.println(kosul1 ? "Sinifi Gectiniz" : "Sinifta Kaldiniz");

    }
}
