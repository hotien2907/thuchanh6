package ThucHanh3;

public class Main {
    public static void main(String[] args) {
        Category dm1 = new Category("quan",1);
        Category dm2 = new Category("ao",1);
             dm1.disPlayCategory();
             dm2.disPlayCategory();
        Product product1 = new Product( 1,"quan hoa",2.3f,dm1);
        Product product2 = new Product( 2,"ao hoa",2.7f,dm2);
        Product product3 = new Product( 3,"quan hoa",2.3f,dm1);
        System.out.println("Thông tin sản phẩm là: ");
        product1.display();
        product2.display();
        product3.display();
    }
}
