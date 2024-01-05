import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        double sayi1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double sayi2 = input.nextDouble();

        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        int islem = input.nextInt();

        switch(islem) {
            case 1:
                System.out.print("Toplama işlemi sonucu: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.print("Çıkarma işlemi sonucu: " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.print("Çarpma işlemi sonucu: " + (sayi1 * sayi2));
                break;
            case 4:
                System.out.print("Bölme işlemi sonucu: " + (sayi1 / sayi2));
                break;
            default:
                System.out.print("Hatalı giriş.");
        }
    }
}
