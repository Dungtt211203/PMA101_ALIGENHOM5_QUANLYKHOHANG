package lab1;

public class Product implements DAO {

    private String name;
    private double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public double getImportTax() {
        return price * 0.1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public void insert() {
        System.out.println("them moi thanh cong");
    }

    @Override
    public void update() {
        System.out.println("cap nhat thanh cong");
    }

    @Override
    public void delete() {
        System.out.println("xoa thanh cong");
    }

    @Override
    public void select() {
        System.out.println("chon thanh cong");
    }

}
