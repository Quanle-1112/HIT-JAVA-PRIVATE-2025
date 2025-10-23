import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử N: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        int choice;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Tinh tong cac phan tu cua mang");
            System.out.println("2. In ra phan tu lon nhat, nho nhat");
            System.out.println("3. Sap xep lai mang theo chieu tang dan");
            System.out.println("4. In ra so nguyen to lon nhat trong mang");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Tong cac phan tu cua mang: " + Utils.tinhTong(arr));
                    break;

                case 2:
                    System.out.println("Phan tu lon nhat: " + Utils.timMax(arr));
                    System.out.println("Phan tu nho nhat: " + Utils.timMin(arr));
                    break;

                case 3:
                    Utils.sapXep(arr);
                    System.out.print("Mang sau khi sap xep: ");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 4:
                    int soNguyenToMax = Utils.timSNTMax(arr);
                    if (soNguyenToMax == -1)
                        System.out.println("Mang khong co so nguyen to");
                    else
                        System.out.println("So nguyen to lon nhat la: " + soNguyenToMax);
                    break;

                case 0:
                    System.out.println("Ket thuc.");
                    break;

                default:
                    System.out.println("Lua chon khonbg hop le, vui long thu lai!");
                    break;
            }

        } while (choice != 0);

        sc.close();
    }
}
