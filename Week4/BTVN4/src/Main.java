import constant.Common;
import constant.ErrorMessage;
import constant.SuccessMessage;
import model.Product;
import service.ProductController;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Product> products = new ArrayList<Product>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductController productController = new ProductController();

        int choice;
        do {
            System.out.println(Common.MENU);
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                choice = 0;
            }

            switch (choice) {
                case 1:
                    System.out.print(Common.ENTER_TYPE);
                    String type = sc.nextLine();
                    System.out.print(Common.ENTER_PRODUCT_NAME);
                    String name = sc.nextLine();
                    System.out.print(Common.ENTER_PRODUCT_DESCRIPTION);
                    String description = sc.nextLine();
                    System.out.print(Common.ENTER_PRODUCT_PRICE);
                    double price;
                    try {
                        price = Double.parseDouble(sc.nextLine());
                    } catch (NumberFormatException e) {
                        price = 0.0;
                    }
                    productController.addProduct(type, name, description, price);
                    break;
                case 2:
                    ArrayList<Product> res = productController.getAllProducts();
                    if (res.isEmpty()) {
                        System.out.println(ErrorMessage.ERROR_EMPTY_LIST);
                    } else {
                        for (Product p : res) {
                            System.out.println(p.getInfo());
                        }
                    }
                    break;
                case 3:
                    System.out.print(Common.ENTER_ID_FOUND);
                    int idFound = Integer.parseInt(sc.nextLine());
                    if (productController.getByID(idFound) != null) {
                        Product foundProduct = productController.getByID(idFound);
                        System.out.print(foundProduct.getInfo());
                    } else {
                        System.out.print(ErrorMessage.ERROR_NOT_FOUND);
                    } break;
                case 4:
                    System.out.print(Common.ENTER_ID_REMOVE);
                    int idRemove = Integer.parseInt(sc.nextLine());
                    productController.removeByID(idRemove);
                    break;
                case 5:
                    System.out.print(SuccessMessage.SUCCES_EXIT);
                    break;
                default:
                    System.out.print(ErrorMessage.ERROR_CHOICE);
            }
        } while (choice != 5);
    }
}