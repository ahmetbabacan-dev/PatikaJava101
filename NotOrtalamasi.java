import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Fizik notunuz: ");
        int fizik = input.nextInt();

        System.out.print("Kimya notunuz: ");
        int kimya = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        int turkce = input.nextInt();

        System.out.print("Matematik notunuz: ");
        int matematik = input.nextInt();

        System.out.print("Tarih notunuz: ");
        int tarih = input.nextInt();

        System.out.print("Müzik notunuz: ");
        int muzik = input.nextInt();

        int ortalama = (fizik + kimya + turkce + matematik + tarih + muzik) / 6;
        System.out.println("Ortalamanız: " + ortalama);

        String s = ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(s);
    }
}