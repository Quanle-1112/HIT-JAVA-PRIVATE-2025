package service;

import constant.Common;
import constant.ErrorMessage;
import constant.SuccessMessage;
import model.Laptop;
import model.Product;
import model.SmartPhone;

import java.util.ArrayList;

public class ProductController {
    ArrayList<Product> products = new ArrayList<>();

    public ProductController() {
    }

    public ProductController(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        if (product != null) {
            products.add(product);
            System.out.println(SuccessMessage.SUCCES_ADD);
        }
    }

    public void addProduct(String type, String name, String description, double price) {
        Product newProduct = null;
        if (Common.PRODUCT_LAPTOP_TYPE.equalsIgnoreCase(type)) {
            newProduct = new Laptop(name, description, price, Common.LAPTOP_RAM, Common.LAPTO_CPU);
        } else if (Common.PRODUCT_SMARTPHONE_TYPE.equalsIgnoreCase(type)) {
            newProduct = new SmartPhone(name, description, price, true);
        } else {
            System.out.println(ErrorMessage.ERROR_INVALID_PRODUCT);
        }
        addProduct(newProduct);
    }

    public  void removeByID(int id) {
        boolean remove = this.products.removeIf(product -> product.getId()==id);
        if (remove) {
            System.out.println(SuccessMessage.SUCCES_REMOVE);
        } else {
            System.out.println(ErrorMessage.ERROR_NOT_FOUND);
        }
    }

    public Product getByID(int id) {
        for (Product product : products) {
            if (product.getId()==id) {
                System.out.println(SuccessMessage.SUCCES_FOUNDED+id);
                return product;
            }
        } return null;
    }
    public ArrayList<Product> getAllProducts() {
        return products;
    }
}