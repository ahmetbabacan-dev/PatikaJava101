import java.util.Scanner;

public class KdvHesaplayici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ücret tutarının giriniz: ");

        double tutar = input.nextDouble();
        double kdvOrani = tutar > 1000 ? 0.08 : 0.18;
        double kdvTutari = tutar * kdvOrani;
        double kdvliUcret = tutar + kdvTutari;

        System.out.println("KDV'siz tutar: " + tutar);
        System.out.println("KDV oranı: " + kdvOrani);
        System.out.println("KDV miktarı: " + kdvTutari);
        System.out.println("KDV'li toplam tutar: " + kdvliUcret);
    }
}
