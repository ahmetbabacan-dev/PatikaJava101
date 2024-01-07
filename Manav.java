import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz= 0.95, patlican = 5.00;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo? ");
        int armutKg = input.nextInt();

        System.out.print("Domates kaç kilo? ");
        int domatesKg = input.nextInt();

        System.out.print("Elma kaç kilo? ");
        int elmaKg = input.nextInt();

        System.out.print("Muz kaç kilo? ");
        int muzKg = input.nextInt();

        System.out.print("Patlıcan kaç kilo? ");
        int patlicanKg = input.nextInt();

        double toplamTutar = (armut * armutKg) + (domates * domatesKg) + (elma * elmaKg) + (muz * muzKg) + (patlican * patlicanKg);
        System.out.println(toplamTutar);
    }
}
