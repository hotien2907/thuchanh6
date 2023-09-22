package ThucHanh4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          Calculator  calculator = new Calculator();
        System.out.println("nhập vào số a: ");
        double a = sc.nextDouble();
        System.out.println("nhập vào số b: ");
        double b = sc.nextDouble();

        calculator.setA(a);
        calculator.setB(b);

        System.out.println("tổng của 2 số là: "+ calculator.add());
        System.out.println("tích của 2 số là: "+ calculator.multi());
        System.out.println("hiệu của 2 số là: "+ calculator.sub());
        System.out.println("thương của 2 số là: "+ calculator.div());
    }
}
