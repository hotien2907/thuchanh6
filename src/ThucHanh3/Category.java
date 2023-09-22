package ThucHanh3;

public class Category {
    private String categeryName;
    private int categoryId;

    public Category() {
    }

    public Category(String categeryName, int categoryId) {
        this.categeryName = categeryName;
        this.categoryId = categoryId;
    }

    public void disPlayCategory() {
        System.out.println("mã danh mục: " + categoryId + "\n" +
                "Tên danh mục: " + categeryName);
    }
}
