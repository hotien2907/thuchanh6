package ThucHanh2;

public class Student {
    private String name;
    private int age;
    private boolean sex;
    private int id;
    private String addresss;

    public Student() {

    }

    public Student(String name, int age, boolean sex, int id, String addresss) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.id = id;
        this.addresss = addresss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddresss() {
        return addresss;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }

    public void disPhay() {
        System.out.println("Họ tên: " + name + "\n" +
                "Tuổi: " + age + "\n"
                + "Giớ tính: " + sex +
                "\n" + "Mã Sinh Viên: " + id +
                "\n" + "Địa chỉ: " + addresss+"\n" );
    }
}
