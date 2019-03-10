import java.util.Optional;

public class Tools {
    public static boolean buyTheProduct(Product product) {
        Optional<Product> p = Optional.ofNullable(product);
        return p.map(Product::getName).filter(name -> name == "cellphone").isPresent() &&
                p.map(Product::getPrice).filter(price-> price >= 1000 && price <= 2000).isPresent();
    }
}
