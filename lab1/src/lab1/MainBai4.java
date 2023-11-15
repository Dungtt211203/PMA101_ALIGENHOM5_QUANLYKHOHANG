package lab1;

import java.util.Scanner;

public class MainBai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] p = new Product[3];
        for (int i = 0; i < 3; i++) {
            if (i != 0) {
                Product pr = new Product();
                System.out.printf("Moi ban nhap ten san pham thu %d: ", i + 1);
                String name = sc.nextLine();
                System.out.printf("Moi ban nhap gia san pham thu %d: ", i + 1);
                double price = Double.parseDouble(sc.nextLine());

                Product p1 = new Product(name, price);
                p[i] = p1;
                p[i].insert();
                p[i].update();
                p[i].delete();
                p[i].select();
            } else {
                Product pr = new Product();
                System.out.printf("Moi ban nhap ten san pham thu %d: ", i + 1);
                String name = sc.nextLine();
                System.out.printf("Moi ban nhap gia san pham thu %d: ", i + 1);
                double price = Double.parseDouble(sc.nextLine());

                Product p1 = new NoTaxProduct(name, price);
                p[i] = p1;
                p[i].insert();
                p[i].update();
                p[i].delete();
                p[i].select();
            }
        }
        for (Product product : p) {
            System.out.println("Ten san pham: " + product.getName() + " - Gia san pham:" + product.getPrice() + " - Thue nhap khau:" + product.getImportTax());
        }
    }
}
