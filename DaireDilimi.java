import java.util.Scanner;

public class DaireDilimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        int r = input.nextInt(); // r = yarıçap

        System.out.print("Daire diliminin açısını giriniz: ");
        double pi = 3.14, dilimAcisi = input.nextDouble();

        double dilimALani = (pi * (r * r) * dilimAcisi) / 360;
        System.out.println(dilimALani);
    }
}
