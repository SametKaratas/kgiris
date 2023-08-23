import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String ksifre, kad;

        Scanner input = new Scanner(System.in);

        System.out.print("Ad :");
        kad = input.nextLine();
        System.out.print("Sifre :");
        ksifre = input.nextLine();
        
        String ysifre = "";
        String secim = "";
        if(kad.equals("patika") && ksifre.equals("java123")){
            System.out.println("Giris Basarili");
        }else if(!ksifre.equals("java123")){
            System.out.print("Sifreniz yanlis\nSifrenizi degistirmek icin Evet ayni sifreyle devam etmek icin Hayir'a basin :");
            secim = input.nextLine();
        }   if(secim.equals("Evet")){
                System.out.print("Yeni Sifre Girin :");
                ysifre = input.nextLine();
            } if(ysifre.equals("java123")){
                System.out.print("Sifre olusturulamadi.Lutfen yeni sifre girin :");
                ysifre = input.nextLine();
            }   if(!ysifre.equals("java123")){
                    System.out.print("Sifreniz olusturuldu");
            }
        
    }
}