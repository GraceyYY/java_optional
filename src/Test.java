public class Test {
    public static void main(String[] args) {
        Product product1 = new Product("11112222", "cellphone", 1899);
        Product product2= new Product("11110000", "cellphone", 2900);
        Product product3= new Product("20304400", "computer", 5800);

        System.out.println(product1.toString() + "//Do we buy the product? => " + Tools.buyTheProduct(product1));
        System.out.println(product2.toString() + "//Do we buy the product? => " + Tools.buyTheProduct(product2));
        System.out.println(product3.toString() + "//Do we buy the product? => " + Tools.buyTheProduct(product3));
    }
}
