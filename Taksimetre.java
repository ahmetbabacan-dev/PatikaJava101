import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double kmTL = 2.20, acilis = 10;
        int minUcret = 20;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM olarak giriniz: ");
        int km = input.nextInt();

        double ucret = acilis + kmTL * km;

        ucret = (ucret < minUcret) ? minUcret : ucret;
        System.out.println("Toplam ücret: " + ucret);
    }
}
