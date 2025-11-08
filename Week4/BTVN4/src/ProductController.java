import java.util.ArrayList;

public class ProductController {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProduct(String type, String name, String description, double price) {
        Product product = null;
        if(type.equalsIgnoreCase("Laptop")) {
            product = new Laptop(name, description, price);
        } else if (type.equalsIgnoreCase("SmartPhone")) {
            product = new SmartPhone(name, description, price, false);
        } else {
            System.out.println("Khong co sp: "+type);
        }
        products.add(product);
        System.out.println("Da them sp: "+product.getInfo());
    }

    public Product getById(int id) {
        for (Product pr : products) {
            if (pr.getId() == id) {
                return pr;
            }
        }
        return null;
    }

    public boolean removeById(int id) {
        for (Product pr : products) {
            if (pr.getId() == id) {
                products.remove(pr);
                System.out.println("Da xoa sp co ID: " + id);
                return true;
            }
        }
        System.out.println("Ko tim thay sp co ID: " + id);
        return false;
    }


    public void getAllProducts() {
        for (Product pr: products) {
            System.out.println(pr.getInfo());
        }
    }
}
