import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Değişken
        int year;
        String kalan;
//Kullanıcı Girişi
        Scanner input =new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        year =input.nextInt();
//True-False Çıktısı
        kalan = (year%4==0) && (year%100!=0) || (year%400==0) ? "Artık Yıldır" : "Artık Yıl Değildir";
        System.out.println(kalan);
//Program Bitişi
    }
}