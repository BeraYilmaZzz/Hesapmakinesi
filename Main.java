import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();
        System.out.println(" 1-Toplama \n 2-Çıkarma \n 3-Bölme \n 4-Çarpma");
        System.out.print("Seçiniz : ");
        select = input.nextInt();
        switch (select) {
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                switch (n2) {
                    case 0:
                        System.out.println("Bir sayı 0'a bölünemez");
                        break;
                    default:
                        System.out.println(n1 / n2);
                        break;
                    case 4:
                        System.out.println(n1 * n2);
                        break;
                }
        }
    }
}
