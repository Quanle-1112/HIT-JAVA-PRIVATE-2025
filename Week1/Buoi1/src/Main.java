import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 2 so nguyen : ");
        int SoMot = sc.nextInt();
        int SoHai = sc.nextInt();
        int Tong = SoMot+SoHai;
        int Hieu = SoMot-SoHai;
        int Tich = SoMot*SoHai;
        double Thuong = SoMot/SoHai;
        System.out.println("Tong cua a va b la: " + Tong);
        System.out.println("Hieu cua a va b la: " + Hieu);
        System.out.println("Tich cua a va b la: " + Tich);
        System.out.println("Thuong cua a va b la: " + Thuong);


        System.out.print("Nhap tong so giay: ");
        int SoGiay = sc.nextInt();
        if(SoGiay<3600) {
            int phut = SoGiay/60;
            int giay = SoGiay%60;
            System.out.println("0 gio " + phut +" phut " + giay + " giay ");
        }
        else {
            int gio = SoGiay/3600;
            int phut = SoGiay % 3600;
            int giay = phut/ 60;
            System.out.println(gio + " gio " + phut + " phut " + giay + " giay ");
        }
    }
}