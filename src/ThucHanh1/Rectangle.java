package ThucHanh1;

public class Rectangle {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public  double getPerimeter() {
        return  (this.height + this.width)*2;
    }
    public String disPlay(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }


}
