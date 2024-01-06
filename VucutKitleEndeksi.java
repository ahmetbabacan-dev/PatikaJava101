import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kilonuzu KG cinsinden giriniz: ");
        double kilo = input.nextDouble();
        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        double boy = input.nextDouble();

        double bmi = kilo / (boy * boy);
        System.out.print("Vücut kitle endeksiniz: " + bmi);
    }
}
