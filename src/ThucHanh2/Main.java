package ThucHanh2;

public class Main {
    public static void main(String[] args) {
         Student student1 = new Student("hai",20,false ,30,"thanh hoa");
         Student student2 = new Student("hao",22,false ,31,"hai  phong");
         Student student3 = new Student("hung",24,false ,33,"ha noi");
        System.out.println("thông tin học sinh: ");
        student1.disPhay();
        student2.disPhay();
        student3.disPhay();
    }
}
