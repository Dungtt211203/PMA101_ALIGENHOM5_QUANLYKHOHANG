package lab1;

public class NoTaxProduct extends Product {

    public NoTaxProduct(String name, Double price) {
        super(name, price);
    }

    @Override
    public double getImportTax() {
        return 0;
    }

}
