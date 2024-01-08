import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen kullanıcı adınızı giriniz: ");
        String username = input.nextLine();

        System.out.print("Lütfen şifrenizi giriniz: ");
        String password = input.nextLine();

        if(username.equals("ahmetb") && !(password.equals("12345"))) {
            System.out.print("Şifreniz yanlış. Değiştirmek ister misiniz? (y: evet, n: hayır) : ");
            if(input.next().equals("y")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                String newPassword = input.next();
                if(newPassword.equals(password)) {
                    System.out.println("Yeni şifreniz hatalı girdiğiniz şifre ile aynı olamaz.");
                }
                else if(newPassword.equals("12345")) {
                    System.out.println("Yeni şifreniz eski şifreniz ile aynı olamaz.");
                }
                else {
                    password = newPassword;
                    System.out.println("Şifre oluşturuldu.");
                }
            }
        }
        else if(username.equals("ahmetb") && password.equals("12345")) {
            System.out.println("Başarılı giriş.");
        }
        else {
            System.out.println("Hatalı giriş.");
        }
    }
}
