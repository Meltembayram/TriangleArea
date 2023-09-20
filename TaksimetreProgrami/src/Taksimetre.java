import java.util.Scanner;

public class Taksimetre {
    public static void main (String[] args){
    // Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın
        //Taksimetre KM başına 2.20 TL tutmaktadır.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.

        int km;
        double herKm = 2.20, total = 10;
        Scanner input = new Scanner(System.in);
        System.out.println("Kac kilometre gidildi? ");
        km = input.nextInt();

        total += (herKm * km) ;

        //minimum tutar 20 tl alınacağı için ? fonksiyonunu kullanıcaz
        total = (total < 20) ? 20 : total;

        System.out.println("Toplam tutar : " + total);






    }
}
