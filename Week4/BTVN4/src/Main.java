import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== MENU QUAN LY SAN PHAM =====");
            System.out.println("1. Them Laptop");
            System.out.println("2. Them SmartPhone");
            System.out.println("3. Xem danh sach san pham");
            System.out.println("4. Tim san pham theo ID");
            System.out.println("5. Xoa san pham theo ID");
            System.out.println("0. Thoat");
            System.out.print("Moi ban nhap lua chon: ");
            String chon = sc.nextLine();

            switch (chon) {
                case "1":
                    System.out.println("1. Them Laptop");
                    System.out.print("Nhap ID: ");
                    int idLap = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhap ten laptop: ");
                    String name = sc.nextLine();
                    System.out.print("Nhap mo ta: ");
                    String description = sc.nextLine();
                    System.out.print("Nhap gia ban: ");
                    double price = Double.parseDouble(sc.nextLine());
                    System.out.print("Nhap thong so RAM: ");
                    String ram = sc.nextLine();
                    System.out.print("Nhap thong so CPU: ");
                    String cpu = sc.nextLine();
                    Laptop laptop = new Laptop(idLap, name, description, price, ram, cpu);
                    productController.addProduct(laptop);
                    System.out.println("Da them laptop thanh cong!");
                    break;

                case "2":
                    System.out.println("2. Them SmartPhone");
                    System.out.print("Nhap ID: ");
                    int idSP = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhap ten SmartPhone: ");
                    String Name = sc.nextLine();
                    System.out.print("Nhap mo ta: ");
                    String desc = sc.nextLine();
                    System.out.print("Nhap gia: ");
                    double Price = Double.parseDouble(sc.nextLine());
                    System.out.print("Co ho tro 5G khong? (true/false): ");
                    boolean has5G = Boolean.parseBoolean(sc.nextLine());
                    SmartPhone smartPhone = new SmartPhone(idSP, Name, desc, Price, has5G);
                    productController.addProduct(smartPhone);
                    System.out.println("Da them smartphone thanh cong!");
                    break;

                case "3":
                    System.out.println("=== Danh sach san pham ===");
                    productController.getAllProducts();
                    break;

                case "4":
                    System.out.print("Nhap ID san pham can tim: ");
                    int findId = Integer.parseInt(sc.nextLine());
                    Product found = productController.getById(findId);
                    if (found != null) {
                        System.out.println("Thong tin san pham: " + found.getInfo());
                    } else {
                        System.out.println("Khong tim thay san pham co ID: " + findId);
                    }
                    break;

                case "5":
                    System.out.print("Nhap ID san pham can xoa: ");
                    int removeId = Integer.parseInt(sc.nextLine());
                    productController.removeById(removeId);
                    break;

                case "0":
                    System.out.println("Thoat chuong trinh.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lua chon khong hop le, vui long nhap lai!");
            }
        }
    }
}
