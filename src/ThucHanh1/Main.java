package ThucHanh1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào chiều dài :");
        double width = sc.nextDouble();
        System.out.println("nhập vào chiều ro :");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("chu vi HCN là: " + rectangle.getArea());
        System.out.println("diện tích HCN là: " + rectangle.getPerimeter());
    }

}
