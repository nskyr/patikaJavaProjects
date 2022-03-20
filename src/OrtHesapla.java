import java.util.Scanner;


public class OrtHesapla {
    public static void main(String[] args){
        //Sabitlerimizi tanımlayalım.
        int dersSayisi = 6;
        int top;
        double ort;
        String sonuc;
        // Not değişkenlerimizi tanımlayalım
        int fizik, kimya, matematik, muzik, tarih, turkce ;

        //Kullanıcıdan değerleri alalım
        Scanner not = new Scanner(System.in);

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = not.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = not.nextInt();

        System.out.print("Matematik notunuzu giriniz: ");
        matematik = not.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = not.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = not.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = not.nextInt();

        //Ortalama hesaplayıp sonucu bildirelim.

        top = fizik + kimya + matematik + muzik + tarih + turkce;
        ort = top/dersSayisi;

        System.out.println("Not ortalamanız: " +ort);
        sonuc = (ort>60) ? "Sınıfı geçtiniz." : "Sınıfta kaldınız.";

        System.out.println(sonuc);

    }
}
