import java.util.Scanner;

public class Main {
    public static boolean SNT(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu cua day: ");
        int n = sc.nextInt();
        Mang.printArray();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int sum =0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int tich=0;
        for(int i=0;i<n;i++) {
            tich *= arr[i];
        }
        System.out.println("\nTong cua day la: " + sum);
        System.out.println("\nTich cua day la: " + tich);

        System.out.print("\nDay SNT la: ");
        for (int i = 0; i < n; i++) {
            if (SNT(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.print("\nDay ko phai SNT la: ");
        for (int i = 0; i < n; i++) {
            if (!SNT(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

