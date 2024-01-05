import java.util.Scanner;

public class UcgenAlaniHesaplayici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. kenarı giriniz: ");
        int a = input.nextInt();
        System.out.println("2. kenarı giriniz: ");
        int b = input.nextInt();
        System.out.println("3. kenarı giriniz: ");
        int c = input.nextInt();;

        int x = (a+b+c) / 2; // x = üçgenin çevresinin yarısı

        double alan = Math.sqrt(x * (x - a)* (x - b) * (x - c));
        System.out.println("Alan: " + alan);
    }
}
